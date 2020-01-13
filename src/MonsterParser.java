import java.io.IOException;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import static java.util.stream.Collectors.toList;

public class MonsterParser extends Parser
{
	
	private ArrayList<String> monsterList = new ArrayList<>();
	private HashMap<String, Integer> statsList = new HashMap<>();	
	private HashMap<String, Monsters> monsters = new HashMap<>();
	
	

	public MonsterParser(String filename, HashMap<String, Moves> movesList) throws IOException
	{
		super(filename);
		
		 
		Collections.addAll(this.monsterList, elements);
		
		for (String mons: monsterList)
		{
			String[] attri = mons.split(";"); //initial entry separation
			
			
			String name = attri[0].split(":")[1];
			String type = attri[1].split(":")[1];
			
			String[] types = (type.indexOf(',') > 0) ? type.split(",") : new String[] {type};

			 System.out.println(name);
			

			
			int rank = Integer.parseInt(attri[2].split(":")[1]);
			String[] statStrings =  attri[3].split(":")[1].split(",");
			
			ArrayList<Integer> stats = (ArrayList<Integer>) Arrays.asList(statStrings)
													.stream().map(Integer::parseInt)
													.collect(toList());
			//fancy map thing
			
			String[] moveStrings = attri[4].split(":")[1].split(",");
			ArrayList<Moves> moves = Moves.parseStrings(moveStrings, movesList);
			
			
			this.monsters.put(name, new Monsters(name, rank, types, stats, moves));
			
			
			
		}
		
		
	}

	
	public HashMap<String, Monsters> getMonsterMap()
	{
		return this.monsters;
	}
	
	
	
	
	
	
	
	
}
