package com.ankur.day2;

@FunctionalInterface
interface myapp{
	public void m1();
}

public class Test_Demo_one {
	public static void main(String[] args) {
		myapp ma= ()->System.out.println("m1 is called...");
		ma.m1();
		
	}

}
