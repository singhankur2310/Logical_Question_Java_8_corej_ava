package com.ankur.it;

class Test{
	public void m1() {
		System.out.println("m1() in Test");
	}
}

public class callFunctionalInterface {
	public static void main(String[] args) {
		Test test = new Test();
		Runnable rn = test::m1;
		rn.run();
		
	}

}
