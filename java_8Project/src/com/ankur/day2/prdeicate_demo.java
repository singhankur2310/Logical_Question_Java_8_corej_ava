package com.ankur.day2;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class prdeicate_demo {
	public static void main(String[] args) {
		Predicate<Integer> pr = i->i>10;
		System.out.println(pr.test(10));
		System.out.println(pr.test(15));
		System.out.println(pr.test(5));
		System.out.println(pr.test(25));
		
		System.out.println("==================");
		BiPredicate<Integer, Integer> bip =(i,j)->(i+j)>=20;
		System.out.println(bip.test(5, 5));
		System.out.println(bip.test(10, 20));
	}

}
