package org.tnsif.framework;

public abstract class PrimeAcc extends shopAcc{
	
	private boolean isPrime;
	
	private static final float deliveryCharges = 0.0f;

	public PrimeAcc(int accno, String accnm, float charges, boolean isPrime, float deliveryCharges) {
		super(accno, accnm, charges);
		
		// TODO Auto-generated constructor stub
		
		 this.isPrime =isPrime;
	}

	
	

	
	public boolean isPrime() {
		return isPrime;
	}





	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}





	public static float getDeliverycharges() {
		return deliveryCharges;
	}





	public void bookProduct(float charges){
		
		System.out.println("Acc"+this.getAccno()+" "+"Acc name : "+ this.getAccnm()+" "+"Delivery Charges: "+(this.getCharges()+this.deliveryCharges));
		
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	
	

}
