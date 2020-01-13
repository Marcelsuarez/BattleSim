import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		MoveParser moveparser = new MoveParser("MoveList");
		MonsterParser monsterparser = new MonsterParser("MonsterList", moveparser.getMovesMap());
		
		HashMap<String, Monsters> allMonsters = monsterparser.getMonsterMap();
		
		
		
		ArrayList<Monsters> player = new ArrayList<>();
		ArrayList<Monsters> enemy = new ArrayList<>();
		
		player.add(new Monsters(allMonsters.get("Narbite")));
		player.add(new Monsters(allMonsters.get("Narghoul")));
		player.add(new Monsters(allMonsters.get("Unisoul")));
		enemy.add(new Monsters(allMonsters.get("Flarling")));
		enemy.add(new Monsters(allMonsters.get("Bouqlet")));
		enemy.add(new Monsters(allMonsters.get("Pterangle")));
		
		BattleInstance battle = new BattleInstance(enemy, player);
		
		
		//System.out.println(moveparser.getMovesMap().get("Growl"));
		
		while (!battle.getWin())
		{
		
			System.out.println(battle.getFullFrame());
			int input = scan.nextInt();

			switch (input)
			{
				case 1:
				case 2:
				case 3:
				case 4:
					battle.getPlayer().setHeldMove(input - 1);
					battle.getEnemy().setHeldMove(rand.nextInt(4)); //0-3
					
					Monsters[] mons = battle.getFaster();
					
					
					
					battle.doMove(mons[0], mons[1], mons[0].getHeldMove());
					System.out.println(battle.getText(2)); //show use text
					Thread.sleep(500);
					System.out.println(battle.getText(0)); //show dmg text
					Thread.sleep(500);
					System.out.println(battle.getText(1)); //show move method text
					Thread.sleep(500);
					if (!mons[1].isFainted())
					{
						battle.doMove(mons[1], mons[0],mons[1].getHeldMove()); //second monster goes
						System.out.println(battle.getText(2)); //show use text
						Thread.sleep(500);
						System.out.println(battle.getText(0)); //show dmg text
						Thread.sleep(500);
						System.out.println(battle.getText(1));
						Thread.sleep(500);
						if (mons[0].isFainted())
						{
							boolean p = battle.checkPlayer(mons[0]); //if fastest monster is the player
							battle.faintTurn(p);
							System.out.println(battle.getText(4));
							Thread.sleep(500);
							if (p)
							{
								System.out.println("Send out who?");
								System.out.println(battle.getPartyFrame());
								input = scan.nextInt();
								battle.sendOut(p, input);
							}
							else
							{
								battle.sendOut(p, 0);
							}
							System.out.println(battle.getText(3));
							Thread.sleep(500);
						}
					}
					else
					{
						boolean p = battle.checkPlayer(mons[1]);
						battle.faintTurn(p);
						System.out.println(battle.getText(4));
						Thread.sleep(500);
						if (p)
						{
							System.out.println("Send out who?");
							System.out.println(battle.getPartyFrame());
							input = scan.nextInt();
							battle.sendOut(p, input);
						}
						else
						{
							battle.sendOut(p, 0);
						}
						System.out.println(battle.getText(3));
						Thread.sleep(500);
					}
					
					break;
				case 5:      //on switch
					System.out.println(battle.getPartyFrame());
					input = scan.nextInt();
					battle.doSwitch(input);
					System.out.println(battle.getText(3)); //switch text
					
					
					battle.getEnemy().setHeldMove(rand.nextInt(4));
					
					battle.doMove(battle.getEnemy(), battle.getPlayer(), battle.getEnemy().getHeldMove()); //second monster goes
					System.out.println(battle.getText(2)); //show use text
					System.out.println(battle.getText(0)); //show dmg text
					System.out.println(battle.getText(1));
					if (battle.getPlayer().isFainted())
					{
						System.out.println("Send out who?");
						System.out.println(battle.getPartyFrame());
						input = scan.nextInt();
						battle.sendOut(true, input);
					}		
					break;
				default:
					System.out.println("Invalid input");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		

	}

}
