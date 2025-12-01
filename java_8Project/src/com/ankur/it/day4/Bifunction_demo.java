package com.ankur.it.day4;

import java.util.function.BiFunction;

public class Bifunction_demo {
	public static void main(String[] args) {
BiFunction<Integer, Integer, Integer> bif=(a,b)->a+b;
	System.out.println(bif.apply(30, 20));
	
	}

}
