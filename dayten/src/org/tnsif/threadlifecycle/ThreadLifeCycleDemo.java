package org.tnsif.threadlifecycle;

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		SoftSkill S = new SoftSkill();
		Tech t = new Tech();
		
		t.start();
			
		t.yield(); 
		
		S.start();
		//mm
		t.run();
		
		

	}

}
