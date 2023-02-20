package org.tnsif.multithreading;

public class SynchronizationDemo 
{

	
	synchronized void print(int n)
	{
		for(int i = 0; i<=5; i++)
		{
			System.out.println(n*i);
		}
	}
	
}//nxnsxn

class ThreadOne extends Thread
{
	SynchronizationDemo D;

	public ThreadOne(SynchronizationDemo d) {
		super();
		D = d;
	}
	
	public void run()
	{
		try
		{
			D.print(10);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
}

//Thread 2
class ThreadTwo extends Thread
{
	SynchronizationDemo D;

	public ThreadTwo(SynchronizationDemo d) {
		super();
		D = d;
	}
	
	public void run()
	{
		try
		{
			D.print(5);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
}

