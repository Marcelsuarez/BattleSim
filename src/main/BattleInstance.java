package main;

import dataTypes.*;
import static java.util.stream.Collectors.toList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Random;


public class BattleInstance
{

	
	private ArrayList<Monsters> enemy, player; //the two parties
	private Monsters eLead, pLead;  //current monster in battle
	private Monsters atk, def;
	private Random rand = new Random();
	private Moves playerMove, enemMove;
	private int currentdmg;
	private MoveMethod funcs = new MoveMethod();
	private String dmgText, moveText = "", useText, switchText, faintText, superText = "";
	private boolean win = false;
	
	
	
	
	
	
	BattleInstance(ArrayList<Monsters> enemy,  ArrayList<Monsters> player)
	{
		this.enemy = enemy;
		this.player = player;
		this.eLead = enemy.get(0);
		this.pLead = player.get(0);	
	}
	
	
	public Monsters getPlayer()
	{
		return this.pLead;
	}
	
	public Monsters getEnemy()
	{
		return this.eLead;
	}
	
	public int getDmg()
	{
		return this.currentdmg;
	}
	
	
	public String getFrame()  //I think returning as a String makes it more flexible as opposed to just doing void and print
	{
		ArrayList<Moves> moves = this.pLead.getMoves();
		String frame = 	"‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾\n" +
							  	"                      5 ►Party  \n" +
							  	"__________________________________________________________\n" +
							  	"  1 ► " + moves.get(0).getName() + " pp:" + moves.get(0).getAttri("pp") + "   |  2 ► " + moves.get(1).getName()+ " pp:" +  moves.get(1).getAttri("pp") + "\n" +
								"‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾\n" +
								"                  What will " + this.pLead.getName() + " do?\n" +
								"__________________________________________________________\n" +
								"  3 ► " + moves.get(2).getName() + " pp:" + moves.get(2).getAttri("pp") + "   |  4 ► " + moves.get(3).getName()+ " pp:" +  moves.get(3).getAttri("pp") + "\n" +
								"‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾\n";
		
		return frame;
		
	}
	
	
	
	public String getStatBar(boolean player)
	{
		Monsters mons =  player ? this.pLead : this.eLead;
		String bar = "    " + mons.getName() + " | " + "𝑻𝒚𝒑𝒆: " + mons.getSType() + "  | "
		+ mons.getStat("atk") + "/" + mons.getStat("def") + "/" + mons.getStat("spa") + "/"
	    + mons.getStat("spd") + "/" + mons.getStat("speed");
		
		return bar;
	}
	
	
	
	public String getHPbar(boolean player)
	{
		Monsters mons = player ? this.pLead : this.eLead;
		String bar = null;
		int base = mons.getBase("hp");
		int hp = mons.getStat("hp");
		String zeroes = "";
		
		if (base >= 100)
		{
			if (hp < 100 && hp >= 10) { zeroes = "0";}
			if (hp < 10) { zeroes = "00";}
			
			bar = "    | 𝐇𝐏◣  " + zeroes + hp + "/" + base + " \\";
		}
		else
		{
			if (hp < 10) { zeroes = " ";}
			
			bar = "    /  ◢𝐇𝐏   " + hp + "/" + base + "   " + zeroes + "|";
		}
		
		return bar + "\n";
		
	}
	
	public String getFullFrame()
	{
		return  "____________________________________________________________\n"
	    + this.getStatBar(true) + this.getHPbar(true) + this.getStatBar(false)
		+ this.getHPbar(false)	+ this.getFrame();
	}
	
	public String getPartyFrame()
	{
		StringBuilder frame = new StringBuilder();
		int counter = 1;
		
		for (Monsters mons: this.player)
		{
			frame.append(counter + "►" + mons.getName() + " 𝐇𝐏: " + mons.getStat("hp") + "/" + mons.getBase("hp")
			+ " " + mons.getIcon() + "\n");
			frame.append("______________________\n");
			counter++;
		}
		
		return "𝑷𝒂𝒓𝒕𝒚\n " + "____________________________\n" + frame.toString();
		
	}
	

	
	
	
	
	
	public int dmgCalc(Monsters atk, Monsters def, Moves move)
	{
		
		int base = move.getAttri("base");
		
		double mod = 1;
		double ad = move.isPhy() ?  (double)atk.getStat("atk")/def.getStat("def") : (double)atk.getStat("spa")/def.getStat("spd");
		double dmg;
		int roundmg;
		double luck = (double)(this.rand.nextInt(16) + 85)/100;
		double effect = 	def.getType()
							   	.stream()
							   	.map(monType -> move.getType().calcEffective(monType))  //.collect(toList()).stream(), dont think I need this
							   	.reduce(1.0, (val1, val2) -> val1 * val2);
		
		
		
		if (effect > 1.0) {this.superText = "It's supereffective!";}
		
		if (effect == 1.0) {this.superText = "";}
		
		if (effect < 1.0) {this.superText = "It wasn't very effective!";}
		
	   	//Holy functional programming
							   	
		
		//STAB check
		if (atk.getType().stream().map(type -> type == move.getType()).reduce(false, (b1, b2) -> b1 | b2) )
		{
			mod = mod * 1.5;
		}
		
		mod = mod * luck * effect;
		
		dmg = ((  ((22 * move.getAttri("base")) * ( ad) )/50) + 2) * mod;
		roundmg = (int) Math.round(dmg);											 
			
		return (base != 0) ? roundmg : 0;
			
		
	}
	
	
	public void doMove(Monsters atk, Monsters def, Moves move)
	{

		this.atk = atk;
		this.def = def;
		int funcid = move.getAttri("funcId");
		int acc = move.getAttri("acc");
		int chance = rand.nextInt(100) + 1;
		
		
		this.useText = atk.getName() + " used " + move.getName() + "!";
		
		
		if (chance > acc)   //Move misses in this check
		{
			this.currentdmg = 0;
			this.moveText = "it missed!";
			this.dmgText = "";
			this.superText = "";
			
		}
		else
		{
			move.removePP();
			
			if (move.getAttri("base") != 0)
			{
				this.currentdmg =  dmgCalc(atk, def, move);
				def.sumHP(-1 * this.currentdmg);
				this.dmgText = "It did " + this.currentdmg + " damage! " + this.superText;
			}
			else
			{
				this.currentdmg = 0;
				this.superText = "";
				this.dmgText = "";
			}
			
			if (funcid != 0)
			{
				this.moveText = this.funcs.getFunc(funcid).apply(this);
			}
			else
			{
				this.moveText = "";
			}
		
		}
	}
	
	public void faintTurn(boolean player)
	{
		if (!player)
		{
			this.faintText = this.eLead.getName() + " has fainted!";
			this.enemy.remove(0);
		}
		else
		{
			this.faintText = this.pLead.getName() + " has fainted!";
			this.player.remove(0);
		}
		
		
	}
	

	public Monsters getAtk()
	{
		return this.atk;
	}
	
	public Monsters getDef()
	{
		return this.def;
	}
	
	
	public String getText(int val)
	{
		
		switch (val)
		{
		case 0:
			return this.dmgText;
		case 1:
			return this.moveText;
		case 2:
			return this.useText;
		case 3:
			return this.switchText;
		case 4:
			return this.faintText;
		default:
			return "";
		}
		
		
	}
	
	public Monsters[] getFaster()
	{
		
		Monsters first = (this.pLead.getStat("speed") >= this.eLead.getStat("speed")) ? this.pLead : this.eLead;
		Monsters second = (this.pLead.getStat("speed") >= this.eLead.getStat("speed")) ? this.eLead : this.pLead;
		
		//very crude way of doing this but it works
		
		Monsters[] list = new Monsters[2];
		list[0] = first;
		list[1] = second;			
		
		return list;

		
		
	}
	
	public void doSwitch(int pos)
	{
		Collections.swap(this.player, 0, pos - 1);
		this.pLead = this.player.get(0);
		this.switchText = this.pLead.getName() + " gets switched in!";
	}
	
	public void sendOut(boolean player, int pos)
	{
		if (player)
		{
			this.pLead = this.player.get(pos - 1);
			this.switchText = this.pLead.getName() + " gets sent out!";
		}
		else
		{
			this.eLead = this.enemy.get(0);
			this.switchText = this.eLead.getName() + " gets sent out!";
		}
	}
	
	public boolean getWin()
	{
		return this.win;
	}
	

	public boolean checkPlayer(Monsters mons)
	{
		return (mons.equals(this.pLead));
	}
	
	public void checkWin()
	{
		this.win = (this.player.size() == 0 | this.enemy.size() == 0);
	}
	
	
	public boolean validSwitch(int input)
	{
		return (input <= this.player.size());
	}
	
	
	
	
	
}
