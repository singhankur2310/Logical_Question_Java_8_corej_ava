package com.ankur.day2;
@FunctionalInterface
interface myappp{
	public void m2();
	
}
public class Test_demo_rwo implements myappp{

	@Override
	public void m2() {
		System.out.println("m2 is called");
		
	}
	public static void main(String[] args) {
		

     Test_demo_rwo tdr = new Test_demo_rwo();
     tdr.m2();
	}

}
