package com.ankur.it.day4;

public class instanceMethodRefDemo {
		public void m1() {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
		}
	
		public static void main(String[] args) {
			instanceMethodRefDemo imr = new instanceMethodRefDemo();
			Runnable r = imr::m1;
			Thread t = new Thread(r);
			t.start();
}
}
