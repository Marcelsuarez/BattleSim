
public class Moveset {

	private Moves m1;
	private Moves m2;
	private Moves m3;
	private Moves m4;
	private Moves [] moves = new Moves[4];
	
	
	
	
	public Moveset(Moves m1, Moves m2, Moves m3, Moves m4) {
		
	this.setM1(m1);
	this.setM2(m2);
	this.setM3(m3);
	this.setM4(m4);
		
		
		
	}
	public Moves getM1() {
		return m1;
	}
	public void setM1(Moves m1) {
		this.m1 = m1;
	}
	public Moves getM2() {
		return m2;
	}
	public void setM2(Moves m2) {
		this.m2 = m2;
	}
	public Moves getM3() {
		return m3;
	}
	public void setM3(Moves m3) {
		this.m3 = m3;
	}
	public Moves [] getMoves() {
		return moves;
	}
	public void setMoves(Moves [] moves) {
		this.moves = moves;
	}
	public Moves getM4() {
		return m4;
	}
	public void setM4(Moves m4) {
		this.m4 = m4;
	}
}

