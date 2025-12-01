package com.ankur.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class takeanumbergreatethan20 {
		public static void main(String[] args) {
			List<Integer> list = Arrays.asList(64,20,56,89,5,2,93);
			//Approach - 1 normal java
			/*for(Integer i : list) {
				if(i>20) {
					System.out.println(i);
					
				}
			}*/
			//Approach - 2 
			/*Stream<Integer> stream = list.stream();
			Stream<Integer> filter = stream.filter(i-> i > 20);
			filter.forEach(x->System.out.println(x));
			*/
			// Approach - 3 
			list.stream().filter(i -> i >20).forEach(i->System.out.println(i));		
		}
}
