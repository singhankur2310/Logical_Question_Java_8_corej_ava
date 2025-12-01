package com.ankur.it.day4;
//Apporach -2
public class ThradDemo2 {
	public static void main(String[] args) {
//Anonnymous implementation
	Runnable r = new Runnable() {
		@Override
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
		}
	};
	
	Thread t = new Thread(r);
	t.start();
	

}
}
