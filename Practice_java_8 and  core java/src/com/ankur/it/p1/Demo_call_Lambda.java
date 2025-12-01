package com.ankur.it.p1;
@FunctionalInterface
interface I1{
	public void m1(Integer i);
	
	public static void m2() {
		System.out.println("call m2 methid static .............");
	}
}
public class Demo_call_Lambda {
	public static void main(String[] args) {
		I1 i = (a)->{
			System.out.println(a);
		};
		i.m1(101);
		// calls annonymouns inner class
		
		I1 i2 = new I1(){
			@Override
			public void m1(Integer i) {
				System.out.println("m1(Integer i) ....");
			}
			
		};
		i2.m1(201);
		
		
	}

}
