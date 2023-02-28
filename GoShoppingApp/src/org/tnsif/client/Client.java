package org.tnsif.client;

import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopFactory f = new GSShopFactory();
		
		GSPrimeAcc p = new GSPrimeAcc(1233,"Mohandas Gandhi",1050f,true);
		
		GSNormalAcc N = new GSNormalAcc(1526,"Albert Enstine",1050f,60f);
		
		System.out.println("Prime Acc");
		System.out.println(p);
		p.bookProduct(p.getCharges());
		
		System.out.println("Normal Acc");
		System.out.println(N);
		N.bookProduct(N.getCharges());
	}

}
