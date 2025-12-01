package com.ankur.day3;

import java.util.function.Function;

public class Function_Demo {
	public static void main(String[] args) {
		Function<String, Integer> f = (name)->name.length();
		System.out.println(f.apply("Ankur"));
		System.out.println(f.apply("prity"));
		System.out.println(f.apply("Ravi"));
	}

}
