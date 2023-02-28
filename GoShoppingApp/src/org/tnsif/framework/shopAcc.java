package org.tnsif.framework;

public abstract class shopAcc {
	
	private int accno;
	private String accnm;
	private float charges;
	
	
	
	//getter and setters
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccnm() {
		return accnm;
	}
	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	//Parameterized constructor
	public shopAcc(int accno, String accnm, float charges) {
		super();
		this.accno = accno;
		this.accnm = accnm;
		this.charges = charges;
	}
	
	
	@Override
	public String toString() {
		return "shopAcc [accno=" + accno + ", accnm=" + accnm + ", charges=" + charges + "]";
	}
	
	
	abstract void bookProduct(float charges);
	
	public void items(float charges) {
		 
		System.out.println();
	}

}
