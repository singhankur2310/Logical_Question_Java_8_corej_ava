package com.ankur.it.day5;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner("-");
		sj1.add("Ankur");
		sj1.add("IT");
		sj1.add("Java");
		System.out.println(sj1);
		
		
		StringJoiner sj2 = new StringJoiner("-","(",")");
		sj2.add("Ankur");
		sj2.add("IT");
		sj2.add("Java");
		System.out.println(sj2);
		
	}

}
