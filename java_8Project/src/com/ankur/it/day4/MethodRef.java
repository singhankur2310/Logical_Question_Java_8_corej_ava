package com.ankur.it.day4;
@FunctionalInterface
interface MyInterface{
	public void m1();
}

public class MethodRef {
	
	public static void m2() {
		System.out.println("m2() method is called");
	}
	public static void main(String[] args) {
		MyInterface mi1 =()->System.out.println("Helo");
		mi1.m1();
		
		MyInterface mi=MethodRef::m2;
		mi.m1();
		
	}

}
