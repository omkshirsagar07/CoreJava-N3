package org.tnsif.multithreading;


public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread T = Thread.currentThread();
		
		System.out.println("Current Thread " + T );
		
		try
		{
			T.sleep(1000);
		}//mm

		catch(Exception e)
		
		{
			System.out.println("Main thread inturrupted");
		}
	}

}
