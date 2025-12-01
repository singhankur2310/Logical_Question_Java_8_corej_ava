package com.ankur.day6;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FirstDemo_Stream {
	public static void main(String[] args) {
		
		//Approach -1
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6);
		
		ArrayList<String>  names = new ArrayList<>();
		names.add("Ankur");
		names.add("Robert");
		names.add("Peter");
		names.add("john");
		names.add("Smith");
		//Approach -2
		Stream<String> stream2 = names.stream();
	
	
	}

}
