package com.ankur.day3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer_demo {
	public static void main(String[] args) {
		Consumer<String> cr =(name)->System.out.println(name+"  Hello Good Morning");
		cr.accept("Ankur");
		cr.accept("Abhi");
		cr.accept("Sanju");
		cr.accept("Ravi");
		
		//using forEach method to print output
		
	List<Integer> numbers = Arrays.asList(1,10,20,30,40,50,60);
	numbers.forEach(n->System.out.println(n));
	}

}
