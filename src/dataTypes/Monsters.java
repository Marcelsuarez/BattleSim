package dataTypes;


import static java.util.stream.Collectors.toList;

import java.lang.Math;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;


public class Monsters
{
	private int rank;
	private ArrayList<Type> type;
	private String name;
	private HashMap<String, Integer> stats = new HashMap<String, Integer>();
	private HashMap<String, Integer> cstats = new HashMap<String, Integer>(); //current stats not base
	private HashMap<String, Modifier> modifiers = new HashMap<String, Modifier>();
	private ArrayList<Moves> moves;
	private Moves heldMove;
	
	//new monsters class all about hashmaps
	
	
	// hp, atk, spa, def, spd, speed -> 0-5
	public Monsters(String name, int rank, String[] types, ArrayList<Integer> statsList, ArrayList<Moves> moves)
	{
		this.name = name;
		this.rank = rank;
		this.type = (ArrayList<Type>) Arrays.asList(types)
						.stream().map(Type::valueOf)
						.collect(toList());
		
		this.stats.put("hp", statsList.get(0));
		this.stats.put("atk", statsList.get(1));
		this.stats.put("spa", statsList.get(2));
		this.stats.put("def", statsList.get(3));
		this.stats.put("spd", statsList.get(4));
		this.stats.put("speed", statsList.get(5));
		this.moves = moves;
		
		stats.forEach((stat, value) ->
		{
			this.cstats.put(stat, value);
			this.modifiers.put(stat, Modifier.ST0);
			
		});
		
		this.modifiers.remove("hp"); //hp cannot be affected by stat modifiers so we remove
		
		
	}
	
	public Monsters(Monsters copy)  //cloning constructor
	{
		this.name = copy.getName();
		this.rank = copy.getRank();
		this.type = copy.getType();
		this.stats = copy.getAllBaseStats();
		this.cstats = copy.getAllCStats();	
		this.moves = copy.getMoves();
		this.modifiers = copy.getModifiers();
	}
	
	public int getStat(String name)
	{
		return this.cstats.get(name);
	}
	
	public HashMap<String, Integer> getAllBaseStats()
	{
		return this.stats;
	}
	
	public HashMap<String, Integer> getAllCStats()
	{
		return this.cstats;
	}
	
	public HashMap<String, Modifier> getModifiers()
	{
		return this.modifiers;
	}
	
	public void setStat(String name, int value)
	{
		assert cstats.containsKey(name);
		this.cstats.put(name, value);
	}
	
	public void sumHP(int value)
	{
		this.cstats.put("hp", this.getStat("hp") + value);
		if (this.cstats.get("hp") > this.stats.get("hp"))
		{
			this.cstats.put("hp", this.getBase("hp"));
		}
	}
	
	public int getBase(String name)
	{
		return this.stats.get(name);
	}
	
	public int getRank()
	{
		return this.rank;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public ArrayList<Type> getType()
	{
		return this.type;
	}
	
	public Type getNtype(int pos)
	{
		return this.type.get(pos);
	}

	public ArrayList<Moves> getMoves()
	{
		return this.moves;
	}
	
	public String getMoveN(int index)
	{
		return this.moves.get(index).getName();
	}

	@Override
	public String toString()
	{
		return this.name + " | Rank: " + this.rank + " | Type: " + this.getSType();
	}

	public String getSType()
	{
		return (this.type.size() == 1)
				? this.type.get(0).toString() : this.type.get(0).toString() + ", " + this.type.get(1).toString();
	}
	
	public String getIcon()
	{
		return ((this.getType().size() == 1)
				? this.getType().get(0).getIcon() : this.getType().get(0).getIcon() + " & " + this.getType().get(1).getIcon());
	}
	
	public void setHeldMove(int pos)
	{
		this.heldMove = this.getMoves().get(pos);
	}
	
	public Moves getHeldMove()
	{
		return this.heldMove;
	}
	
	public boolean isFainted()
	{
		return (this.cstats.get("hp") <= 0);
	}
	
	public void multiplyStats() //not really used for now
	{
		
		HashMap<String, Integer> bstats = this.getAllBaseStats();
		HashMap<String, Modifier> mods = this.getModifiers();
		
		mods.forEach((statname, modval) ->
		{
			this.setStat(statname, (int)(modval.getValue() * bstats.get(statname)));
		});
			
		
	}
	
	public void multiplyStat(String name)
	{
		HashMap<String, Integer> bstats = this.getAllBaseStats();
		HashMap<String, Modifier> mods = this.getModifiers();
		
		this.setStat(name, (int)(mods.get(name).getValue() * bstats.get(name)));
		
	}
	
	public void increaseStat(String name, int stage)
	{
		assert modifiers.containsKey(name);
		assert (stage <= 6) & (stage > 0);
		Modifier newmod = this.modifiers.get(name);
		for (int i = 0; i < stage; i++)
		{
			newmod = newmod.getNext();
			
		}

		this.modifiers.put(name, newmod);
		this.multiplyStat(name);

	}
	
	public void decreaseStat(String name, int stage)
	{
		assert modifiers.containsKey(name);
		assert (stage <= 6) & (stage > 0);
		Modifier newmod = this.modifiers.get(name);
		for (int i = 0; i < stage; i++)
		{
			newmod = newmod.getPrev();
			
		}

		this.modifiers.put(name, newmod);
		this.multiplyStat(name);

	}
	
	
	
}
