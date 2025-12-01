package com.ankur.day7;

import java.util.Arrays;
import java.util.List;

public class MaoDemo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("india","uk","usa","japan","koria");
		
		// normal java use toUppercase() 
	/*for(String name : names) {
		System.out.println(name.toUpperCase());
		
	}*/
		
	//using map toUppercase
		//names.stream().map(name->name.toUpperCase()).forEach(n->System.out.println(n));
		
		// using mapToInt int find length of each name
		names.stream().mapToInt(name->name.length()).forEach(n->System.out.println(n));
	
		
		 
		
	}

}
