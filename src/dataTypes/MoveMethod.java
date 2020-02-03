package dataTypes;

import main.BattleInstance;
import java.util.Random;
import dataTypes.*;
import parsers.*;
import java.util.function.*;
import java.util.HashMap;


public class MoveMethod
{

	private final HashMap<Integer, Function<BattleInstance, String>> funcList = new HashMap<>();

	
	//I can implement movemethod in a lot of different ways but this is the one im going with fornow
	//whether or not its the best option i dont know but i rather have it encapsulated in its own class with hardcoded functions
	//for what the move can do
	
	
	public MoveMethod()
	{

		this.funcList.put(1, MoveMethod::drainLife);
		this.funcList.put(2, MoveMethod::lowerAttack);
		
	}
	

	
	public static String drainLife(BattleInstance battle) //attacker heals for 33% of dmg dealt
	{
		Monsters atk = battle.getAtk();
		int dmg = battle.getDmg();
		atk.sumHP(dmg/3);
		
		return atk.getName() + " has healed for " + dmg/3 + " HP!";
		
	}
	
	public static String lowerAttack(BattleInstance battle) //attacker lowers defender's attack by 1 stage
	{
		Monsters def = battle.getDef();
		def.decreaseStat("atk", 1);
		return def.getName() + "'s attack has been lowered by 1 stage!";	
	}
	
	public static String lowerDefense(BattleInstance battle) //attacker lowers defender's attack by 1 stage
	{
		Monsters def = battle.getDef();
		def.decreaseStat("def", 1);
		return def.getName() + "'s defense has been lowered by 1 stage!";	
	}
	
	public static String increaseDefense(BattleInstance battle) //attacker lowers defender's attack by 1 stage
	{
		Monsters atk = battle.getAtk();
		atk.increaseStat("def", 1);
		return atk.getName() + "'s defense has been increased by 1 stage!";	
	}
	
	public static String takeRecoil(BattleInstance battle)
	{
		int dmg = battle.getDmg();
		Monsters atk = battle.getAtk();
		int recoil = dmg/3;
		
		if (atk.getStat("hp") - recoil <= 0)
		{
			atk.setStat("hp", 1);
		}
		else
		{
			atk.sumHP(recoil * -1);
		}

		return atk.getName() + " has taken " + recoil + " of recoil damage!";
		
	}
	
	public static String sharpReduceSpd(BattleInstance battle)
	{
		String returnstring = "";
		int chance = new Random().nextInt(2);
		
		if (chance == 1)
		{
			Monsters def = battle.getDef();
			def.decreaseStat("spd", 2);
			returnstring = def.getName() + "'s special defense has been dropped by 2 stages!";
		}
		
		
		return returnstring;
		
		
	}
	
	
	public HashMap<Integer, Function<BattleInstance, String>> getMethodMap()
	{
		return this.funcList;
	}
	
	
	public Function<BattleInstance, String> getFunc(int val)
	{
		return this.funcList.get(val);
	}
	
	
	
}
