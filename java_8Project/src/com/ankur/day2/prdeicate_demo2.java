package com.ankur.day2;

import java.util.function.Predicate;
/*
 * 
 Declare names in an array and print names
 which are starting with 'A' using lambda
 Expression 
 * 
 */
public class prdeicate_demo2 {
	public static void main(String[] args) {
	String [] names = {"Ankur","Anushkha","Anupama","Kajol","Ruby","samantha","sunny"};
	Predicate<String> pr = name->name.charAt(0)=='A';
	
	for(String namee : names) {
		if(pr.test(namee)) {
			System.out.println(namee);
		}
		
	}
	
	}

}
