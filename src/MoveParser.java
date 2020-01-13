import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MoveParser extends Parser
{

	private ArrayList<String> moveList = new ArrayList<>();
	private ArrayList<Moves> moves = new ArrayList<>();
	private HashMap<String, Moves> movesMap= new HashMap<>();
	
	public MoveParser(String filename) throws IOException
	{
		super(filename);
																		 //did this because im worried about references in respect to elements maybe?
		Collections.addAll(this.moveList, elements); //only 1 liner code i could find that would do this

		for (String move: this.moveList)
		{
			String[] attri = move.split(";");
			
			String name = attri[0].split(":")[1];
			System.out.println(name);
			String type = attri[1].split(":")[1];
			int accuracy = Integer.parseInt(attri[2].split(":")[1]);
			int base =Integer.parseInt( attri[3].split(":")[1]);
			int points = Integer.parseInt(attri[4].split(":")[1]);
			int isPhysical =Integer.parseInt( attri[5].split(":")[1]);
			int function = Integer.parseInt(attri[6].split(":")[1]);
			
			this.moves.add(new Moves(type, name, base, isPhysical, accuracy, points, function));
			
		}
		
		for (Moves move: this.moves)
		{
			this.movesMap.put(move.getName(), move);
		}
		
		
	}

	
	public Moves getMove(String name)
	{
		return this.movesMap.get(name);
	}
	
	public HashMap<String, Moves> getMovesMap()
	{
		return this.movesMap;
	}
	
	public ArrayList<Moves> getMoveList()
	{
		return this.moves;
	}
	
	
	
	
	
}
