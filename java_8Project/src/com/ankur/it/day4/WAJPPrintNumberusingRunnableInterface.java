package com.ankur.it.day4;
//Approach -3 using lamdba Expression
public class WAJPPrintNumberusingRunnableInterface {
	
	public  void m1() {
		for(int i =1;i<=5;i++) {
			System.out.println(i);
			
		}
	}
	
public static void main(String[] args) {
	WAJPPrintNumberusingRunnableInterface wjp = new WAJPPrintNumberusingRunnableInterface();
	Runnable r = wjp::m1;
	Thread t = new Thread(r);
	t.start();
	
}
}
