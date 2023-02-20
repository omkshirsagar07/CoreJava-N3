package org.tnsif.threadlifecycle;

public class Sender {
	
	public void SendMessage(String message)
	{
		System.out.println("\nSending "+message);
		try 
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}//mmm
}
