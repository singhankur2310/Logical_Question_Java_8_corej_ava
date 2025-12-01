package com.ankur.day8;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplIteratorDemo {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Ankur","Virat","Dhoni","Rohit","Surya");
		
		Spliterator<String> spliterator = asList.stream().spliterator();
		
		spliterator.forEachRemaining(name->System.out.println(name));
	}

}
