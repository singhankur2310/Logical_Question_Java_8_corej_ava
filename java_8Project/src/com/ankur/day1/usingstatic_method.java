package com.ankur.day1;


interface vehicleTest{
	public abstract void start();
	
	public static void clean() {
		System.out.println("cleaning is completed...");
	}
	//add multiplle static or default method allowed
	
	public static void m1() {
		
	}
	public default void m2() {
		
	}
}

class Bus implements vehicleTest{
	@Override
	public void start() {
		System.out.println("start Bus...");
		
	}
}

public class usingstatic_method {
	
	
	public static void main(String[] args) {
		Bus b = new Bus();
		vehicleTest.clean();
		b.start();
		
	}

	

}
