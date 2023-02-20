package org.tnsif.multithreading;

public class ThreadExecutor {

	public static void main(String[] args) {
		
		SimpleThreadProgram p = new SimpleThreadProgram();
	
		//use to chnage the name of current thread
		p.setName("JavaThread");
		
		//use to set the priority of thread
		p.setPriority(10);
		
		//thread comes to run state
		p.start();
		//nn
		//we can't start() a thread twice it will give expection
		//p.start()
		
		System.out.println("current thread : "+ p);
		

	}

}
