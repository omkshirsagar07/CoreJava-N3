package org.tnsif.framework;

public abstract class NormalAcc extends shopAcc{

	
	


	final private float delivaryCharges;

	public NormalAcc(int accno, String accnm, float charges, float delivaryCharges) {
		super(accno, accnm, charges);
		this.delivaryCharges = delivaryCharges;
	}

	
	
	public float getChrges() {
		return delivaryCharges;
	}



	@Override
	public String toString() {
		return "NormalAcc [delivaryChrges=" + delivaryCharges + "]";
	}
	
	public void bookProduct(float charges){
		
		System.out.println("Acc"+this.getAccno()+" "+"Acc name : "+ this.getAccnm()+" "+"Delivery Charges: "+(this.getCharges()+this.delivaryCharges));
		
	}

}
