package dataTypes;

import java.util.ArrayList;
import java.util.EnumSet;

public enum Modifier
{
	STN6(0.25, 0),
	STN5(0.285, 1),
	STN4(0.33, 2),
	STN3(0.4, 3),
	STN2(0.5, 4),
	STN1(0.66, 5),
	ST0(1.0, 6),
	ST1(1.5, 7),
	ST2(2.0, 8),
	ST3(2.5, 9),
	ST4(3.0, 10),
	ST5(3.5, 11),
	ST6(4.0, 12);
	
	
	
	
	private final double value;
	private final int pos;
	
	private Modifier(double value, int pos)
	{
		this.value = value;
		this.pos = pos;
	}
	
	public double getValue()
	{
		return this.value;
	}
	
	public int getPos()
	{
		return this.pos;
	}
	
	public Modifier getNext()
	{
		Modifier[] list = Modifier.values();
		try
		{
			return list[this.getPos() + 1];
		}
		catch (IndexOutOfBoundsException e)
		{
			return list[12];
		}
		
		
	}
	
	public Modifier getPrev()
	{
		Modifier[] list = Modifier.values();
		try
		{
			return list[this.getPos() - 1];
		}
		catch (IndexOutOfBoundsException e)
		{
			return list[0];
		}
		
		
	}
	
	
	
}
