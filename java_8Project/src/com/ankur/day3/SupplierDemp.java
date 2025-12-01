package com.ankur.day3;

import java.util.function.Supplier;

public class SupplierDemp {
public static void main(String[] args) {
	//String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 
	        Supplier<String> s= ()->{
	        					String otp = "";
	        					for(int i=1;i<6;i++) {
	        						otp=otp+(int)(Math.random()*10);
	        					}
	        	 return otp;
	         };
	     System.out.println(s.get());
	     System.out.println(s.get());
	     System.out.println(s.get());
	     System.out.println(s.get());
	     System.out.println(s.get());
	     System.out.println(s.get());
	     System.out.println(s.get());
	     System.out.println(s.get());

 }
}
