import java.lang.Math;

public class Monsters {
	//constructors
	private int id;
	private String n;
	private int hp;
	private int chp;
	private int atk;
	private int catk;
	private int def;
	private int cdef;
	private int spa;
	private int cspa;
	private int spd;
	private int cspd;
	private int spe;
	private int cspe;
	private Moveset moves; //initializing moves object from Moveset class
	private String type;
	private String ctype;
	private String de;
	private int r;  //class type A S or B
	private Modifier mod;  //stores stat modifiers up to 6 stages and status effects


public Monsters(int id, String n, int hp, int chp, int atk, int catk, int def, int cdef, int spa, int cspa, int spd, int cspd, int spe, int cspe, int r, Modifier mod,  Moveset moves, String type, String ctype, String de) {
	this.setId(id);
	this.setN(n);
	this.setHp(hp);
	this.setChp(chp);
	this.setAtk(atk);
	this.setDef(def);
	this.setSpa(spa);
	this.setSpd(spd);
	this.setSpe(spe);
	this.setMoves(moves);
	this.setType(type);
	this.setDe(de);
	this.setR(r);
	this.setMod(mod);
	this.setCatk(catk);
	this.setCdef(cdef);
	this.setCspa(cspa);
	this.setCspd(cspd);
	this.setCspe(cspe);
	this.setCtype(ctype);
																																	}

public Monsters(Monsters copy) {
	this.id = copy.id;
	this.n = copy.n;
	this.hp = copy.hp;
	this.atk = copy.atk;
	this.def = copy.def;
	this.spa = copy.spa;
	this.spd = copy.spd;
	this.spe = copy.spe;
	this.moves = copy.moves;
	this.type = copy.type;
	this.de = copy.de;
	this.mod = copy.mod;
	this.chp = copy.chp;
	this.catk = copy.catk;
	this.cdef = copy.cdef;
	this.cspa = copy.cspa;
	this.cspd = copy.cspd;
	this.cspe = copy.cspe;
	
			
}                     // copy constructors for duplicate monsters on field idk if i really need this cuz i have a method that should do this

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getN() {
	return n;
}
public void setN(String n) {
	this.n = n;
}
public int getHp() {
	return hp;
}
public void setHp(int hp) {
	this.hp = hp;
}
public int getAtk() {
	return atk;
}
public void setAtk(int atk) {
	this.atk = atk;
}
public int getDef() {
	return def;
}
public void setDef(int def) {
	this.def = def;
}
public int getSpa() {
	return spa;
}
public void setSpa(int spa) {
	this.spa = spa;
}
public int getSpd() {
	return spd;
}
public void setSpd(int spd) {
	this.spd = spd;
}
public int getSpe() {
	return spe;
}
public void setSpe(int spe) {
	this.spe = spe;
}
public Moveset getMoves() {
	return moves;
}
public void setMoves(Moveset moves) {
	this.moves = moves;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDe() {
	return de;
}
public void setDe(String de) {
	this.de = de;
}
public int getR() {
	return r;
}
public void setR(int r) {
	this.r = r;
}
public Modifier getMod() {
	return mod;
}
public void setMod(Modifier mod) {
	this.mod = mod;
}
public int getChp() {
	return chp;
}
public void setChp(int chp) {
	this.chp = chp;
}
public int getCatk() {
	return catk;
}
public void setCatk(int catk) {
	this.catk = catk;
}
public int getCspa() {
	return cspa;
}
public void setCspa(int cspa) {
	this.cspa = cspa;
}
public int getCdef() {
	return cdef;
}
public void setCdef(int cdef) {
	this.cdef = cdef;
}
public int getCspd() {
	return cspd;
}
public void setCspd(int cspd) {
	this.cspd = cspd;
}
public int getCspe() {
	return cspe;
}
public void setCspe(int cspe) {
	this.cspe = cspe;
}
public String getCtype() {
	return ctype;
}
public void setCtype(String ctype) {
	this.ctype = ctype;
}


public Moves getM(int num) {     //cool method i made to retrieve a move easily from a monsterv
	Moves m = null;
	
	if ( num == 1) {
		m = this.getMoves().getM1();
	} else
		
	if ( num == 2) {
		m =  this.getMoves().getM2();
	} else 
		
	if ( num == 3) {
		m =  this.getMoves().getM3();
	} else
		
	if (num == 4) {
		m =  this.getMoves().getM4();
	}
	return m;
}


public void reset() {
	int [] arr = new int[] {0, 0, 0, 0, 0};
	Modifier mod1 = new Modifier(arr, atk);
	this.catk = this.atk;
	this.cdef = this.def;
	this.cspa = this.spa;
	this.cspd = this.spd;
	this.cspe = this.spe;
	this.ctype = this.type;
	this.mod = mod1;
	
}

public void multiSet(int pos, double val) { //atk, def, spa, spd, spe
	switch (pos) {  
		case 0:
			this.catk = (int) Math.round(this.atk * val);
			break;
		case 1:
			this.cdef = (int) Math.round(this.def * val);
			break;
		case 2:
			this.cspa = (int) Math.round(this.spa * val);
			break;
		case 3:
			this.cspd = (int) Math.round(this.spd * val);
			break;
		case 4:
			this.cspe = (int) Math.round(this.spe * val);
			break;
					}
}

public void updateStats() {  //updates stats of a monster through checking modifier object array
	int i;
	int modp;
	for ( i = 0; i < 4; ++i)
		{	
			
			
			modp = this.getMod().getNum(i);
			if (modp <= 6 && modp >= -6) {
			switch (modp) {  //atk, def, spa, spd, spe
				case 1:
					this.multiSet(i, 1.5);
					break;
				case 2:
					this.multiSet(i, 2);
					break;
				case 3:
					this.multiSet(i, 2.5);
					break;
				case 4:
					this.multiSet(i, 3);
					break;
				case 5:
					this.multiSet(i, 3.5);
					break;
				case 6:
					this.multiSet(i, 4);
					break;
				case -1:
					this.multiSet(i, 0.66);
					break;
				case -2:
					this.multiSet(i, 0.5);
					break;
				case -3:
					this.multiSet(i, 0.4);
					break;
				case -4:
					this.multiSet(i, 0.33);
					break;
				case -5:
					this.multiSet(i, 0.285);
					break;
				case -6:
					this.multiSet(i, 0.25);
					break;
				case 0:
					this.multiSet(i, 1);
					break;
								}
			}// if statement if stats are out of bounds
		}
}



														}
