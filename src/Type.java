
import java.util.ArrayList;


public enum Type
{
	//First array are weaknesses, second array are strengths, third array resists
	Water(
			new String[]{"Electric", "Grass"},
			new String[]{"Rock", "Fire", "Ground"},
			new String[]{"Water", "Fire", "Ice", "Steel"},
			"🅦🅣🅡"
			),
	Fire(
			new String[]{"Water", "Rock", "Ground"},
			new String[]{"Ice", "Grass", "Beast", "Shadow"},
			new String[]{"Light", "Fire", "Grass", "Ice"},
			"🅕🅡🅔"
			),
	Grass(
			new String[]{"Fire", "Flying", "Shadow", "Ice"},
			new String[]{"Water", "Ground", "Beast"},
			new String[]{"Grass", "Ground", "Rock", "Electric", "Water"},
			"🅖🅡🅢"
			),
	Electric(
			new String[] {"Ground", "Beast", "Shadow"},
			new String[] {"Water", "Flying"},
			new String[] {"Flying", "Steel", "Light"},
			"🅔🅛🅒"
			),
	Flying(
			new String[] {"Electric", "Ice", "Rock"},
			new String[] {"Beast"},
			new String[] {"Ground", "Shadow"},
			"🅕🅛🅨"
			),
	Light(
			new String[] {"Shadow", "Steel", "Water"},
			new String[] {"Shadow", "Dragon", "Ice"},
			new String[] {"Light", "Fire", "Beast"},
			"🅛🅖🅣"
			),
	Shadow(
			new String[] {"Light", "Fire"},
			new String[] {"Dragon", "Light", "Electric"},
			new String[] {"Shadow", "Flying"},
			"🅢🅗🅦"
			),
	Ground(
			new String[] {"Water", "Ice", "Grass"},
			new String[] {"Electric", "Rock", "Fire"},
			new String[] {"Beast", "Rock"},
			"🅖🅡🅓"
			),
	Rock(
			new String[] {"Ground", "Steel", "Water", "Grass"},
			new String[] {"Fire", "Flying", "Ice"},
			new String[] {"Beast", "Dragon", "Fire", "Flying"},
			"🅡🅒🅚"
			),
	Ice(
			new String[] {"Rock", "Steel", "Fire", "Light"},
			new String[] {"Dragon", "Ground", "Grass", "Beast", "Flying"},
			new String[] {"Ice"},
			"🅘🅒🅔"
			),
	Beast(
			new String[] {"Flying", "Fire", "Ice"},
			new String[] {"Electric", "Dragon", "Steel"},
			new String[] {"Beast"},
			"🅑🅢🅣"
			),
	Dragon(
			new String[] {"Ice", "Beast", "Light", "Shadow"},
			new String[] {},
			new String[] {"Water", "Fire", "Grass", "Electric"},
			"🅓🅡🅖"
			),
	Steel(
			new String[] {"Fire", "Beast", "Ground"},
			new String[] {"Ice", "Rock"},
			new String[] {"Light", "Shadow", "Rock", "Flying", "Ice", "Steel"},
			"🅢🅣🅛"
			);
	
	
	private final String[] weakTo;
	
	private final String[] strongAgainst;  //Not really sure if I need this one but I'll make it just in case
	
	private final String[] resists;
	
	private final String icon;
	//private final String[] immune;
	
	private Type(String[] weakTo, String[] strongAgainst, String[] resists, String icon)
	{
		this.weakTo = weakTo;
		this.strongAgainst = strongAgainst;
		this.resists = resists;
		this.icon = icon;
	}
	
	public String getIcon()
	{
		return this.icon;
	}
	
	
	public double calcEffective(Type def)  //much better than a 2d array or double case switch
	{
		Type atk = this;
		double mod = 1.0;
		
		for (String type: def.weakTo)
		{
			if (atk == Type.valueOf(type))
			{
				mod = 1.75;  // not as one shotty as pokemon, normally the value is 2.0
			}
		}
		
		for (String type: def.resists)
		{
			if (atk == Type.valueOf(type))
			{
				mod = 0.5;
			}
		}
		
		
		return mod;
		
	}
	
	
	
	
}
