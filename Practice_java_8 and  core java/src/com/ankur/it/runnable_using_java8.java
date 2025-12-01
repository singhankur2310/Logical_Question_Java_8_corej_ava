package com.ankur.it;

import java.util.concurrent.Callable;

class Ankur{
	public static Object m1() {
		System.out.println("Hello Ankur >>>m1");
		return new Ankur();
	}
	public  int m2(Integer i) {
		System.out.println("Hello Ankur >>>m1");
		return 20;
	}
}
public class runnable_using_java8 {
	public static void main(String[] args) throws Exception {
	
		/*Callable rn = Ankur::m1;
		rn.call();*/
		Callable cn = ()->{
			System.out.println("hello prity...");
			return null;
		};
		cn.call();				
		
	}

}
