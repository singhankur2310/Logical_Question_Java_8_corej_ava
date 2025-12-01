package com.ankur.it;

public class Thread_Demo {
	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i = 0;i<5;i++) {
				System.out.println(i+" "+Thread.currentThread());
				
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
