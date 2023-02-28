package org.tnsif.application;

import org.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accno, String accnm, float charges, float delivaryCharges) {
		super(accno, accnm, charges, delivaryCharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getAccno()=" + getAccno() + ", getAccnm()="
				+ getAccnm() + "]";
	}

	

	
	
	

}
