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
		
	}
	

	
	public static String drainLife(BattleInstance battle) //attacker heals for 33% of dmg dealt
	{
		Monsters atk = battle.getAtk();
		int dmg = battle.getDmg();
		atk.sumHP(dmg/3);
		
		return atk.getName() + " has healed for " + dmg/3 + " HP!";
		
		
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
