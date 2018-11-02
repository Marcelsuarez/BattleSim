
public class Moves {
	
private int base;
private boolean physical;
private String type;
private int id;
private String n;
private int acc;
private int pp;
private int cpp;
private String de;






public Moves(int base, boolean physical, String type, int id, String n, int acc, int pp, int cpp, String de) {
	this.setBase(base);
	this.setPhysical(physical);
	this.setType(type);
	this.setId(id);
	this.setN(n);
	this.setAcc(acc);
	this.setPP(pp);
	this.setCpp(cpp);
	this.setDe(de);
	
}


public int getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public boolean isPhysical() {
	return physical;
}
public void setPhysical(boolean physical) {
	this.physical = physical;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
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
public int getAcc() {
	return acc;
}
public void setAcc(int acc) {
	this.acc = acc;
}
public int getPP() {
	return pp;
}
public void setPP(int pp) {
	this.pp = pp;
}
public int getCpp() {
	return cpp;
}
public void setCpp(int cpp) {
	this.cpp = cpp;
}
public String getDe() {
	return de;
}
public void setDe(String de) {
	this.de = de;
}




																										}
