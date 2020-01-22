package dataTypes;

import java.util.HashMap;
import java.util.ArrayList;


public class Moves {
	
private Type type;	
private String name;
private HashMap<String, Integer> attri = new HashMap<String, Integer>();



	public Moves(String type, String name, int base, int physical, int acc, int pp, int funcId)
	{
		this.attri.put("base", base);
		this.attri.put("isPhysical", physical);
		this.attri.put("acc", acc);
		this.attri.put("pp", pp);
		this.attri.put("funcId", funcId);
		this.type = Type.valueOf(type);
		this.name = name;
	}
	
	public int getAttri(String name)
	{
		return this.attri.get(name);
	}

	public void setAttri(String name, int val)
	{
		assert attri.containsKey(name);
		this.attri.put(name, val);
	}

	public String getName()
	{
		return this.name;
	}

	public Type getType()
	{
		return this.type;
	}

	public static ArrayList<Moves> parseStrings(String[] keys, HashMap<String, Moves> moves)
	{
		ArrayList<Moves> movesList = new ArrayList<>();
		for (String name: keys)
		{
			assert moves.containsKey(name);
			movesList.add(moves.get(name));
		}
		return movesList;
	}
	

	@Override
	public String toString()
	{
		String base = Integer.toString( this.getAttri("base"));
		
		return this.name + " | " + base + " | " + this.type.toString();
	}

	public boolean isPhy()
	{
		return (this.getAttri("isPhysical") > 0) ? true : false;
	}
	
	
	

																										}
