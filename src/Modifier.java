
public class Modifier {

	private int[] stat = { 0, 0, 0, 0, 0 };    //atk, def, spa, spd, spe
	
	
	private int status = 0;  //i dont really know what the fuck i did here, i could have just added an array for the stats instead of making a new object but i guess i can cooler things later on
	
	
	
	
	public Modifier( int[] stat, int status) {
		
		
		this.setStat(stat);
		this.setStatus(status);
		
	}



	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int[] getStat() {
		return stat;
	}
	public void setStat(int[] stat) {
		this.stat = stat;
	}

	
	public void reset() {
		int i;
		for (i = 0; i < 4; ++i)  //for loop to iterate through array and reset values to 0 upon switching or move effect
		{
			this.stat[i] = 0;
		}	
	}
	public int getNum( int num) {
		
		return this.stat[num];
		
	}
public void setNum( int pos, int val) { //atk, def, spa, spd, spe
	
	this.stat[pos] = val;
	
}

public void addNum(int pos, int val) {
	
	this.stat[pos] = this.stat[pos] + val;
}

public void subNum(int pos, int val) {
	
	this.stat[pos] = this.stat[pos] - val;
}


	
	
	
}
