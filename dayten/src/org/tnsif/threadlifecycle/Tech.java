package org.tnsif.threadlifecycle;

public class Tech extends Thread{
	
	public void run()
	{
		System.out.println("Java full stscak training ");
		
		for(int i=0; i<=5; i++)
		{
			System.out.print(i+" ");
			try
			{
				Thread.sleep(00);//mm
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
		System.out.println(" tech session");
		
	}
		

}
