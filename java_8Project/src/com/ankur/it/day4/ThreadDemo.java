package com.ankur.it.day4;
//Apporach -1 normal 
public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		for(int i =1;i<=5;i++) {
			System.out.println(i);
			
		}
		
	}
	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		Thread tr = new Thread(t);
		tr.start();
		
	}

}
