package org.tnsif.usingrunnable;

//program to demonstrate on runnable interface
public class Marathon implements Runnable{
	
	private int speed;
	
	private String city;
	
	//*Runnable* is a functional interface and it contanins the *run()* method 
	@Override
	public void run() {
		
		System.out.println("Speed of a participant : "+speed +" The city is "+city);
		
	}
	//mm
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
