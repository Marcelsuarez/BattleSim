import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Parser
{

	
	private BufferedReader buff;
	private StringBuilder builder = new StringBuilder();
	protected int lineCount = 0;
	protected String[] elements;

	
	
	
	//a monster entry is 6 lines
	
	public Parser(String filename) throws IOException
	{
		this.buff = new BufferedReader(new FileReader(filename));
		String line;
		
		while ((line = this.buff.readLine()) != null)		//use StringBuilders because appending strings is not preferable when doing this
		{
			builder.append(line);
			this.lineCount++;
		}
		
		this.elements = builder.toString().replaceAll("\\s+","").split("-"); //clearing white space before splitting
		
		this.buff.close();
	}
	
	
	
	
}
