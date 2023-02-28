package org.tnsif.application;

import org.tnsif.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

	public GSPrimeAcc(int accno, String accnm, float charges, boolean isPrime) {
		super(accno, accnm, charges, isPrime, charges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getAccno()=" + getAccno() + ", getAccnm()="
				+ getAccnm() + "]";
	}

	

	

}
