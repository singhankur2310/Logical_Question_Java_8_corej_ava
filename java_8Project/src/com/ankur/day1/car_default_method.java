package com.ankur.day1;

interface Vehicle{
	public abstract void start();
	//without effecting implementation class add a new method default or
	// static method
	
	public default void clean() {
		System.out.println("cleaning is completed");
	}
	
}


public class car_default_method implements Vehicle{
	@Override
	public void start() {
		System.out.println("start car..");
		
	}
	
	public static void main(String[] args) {
		car_default_method c = new car_default_method();
		c.clean();
		c.start();
		
		
	}

	

}
