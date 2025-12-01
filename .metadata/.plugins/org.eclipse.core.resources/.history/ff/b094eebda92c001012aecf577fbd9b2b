package com.ankur.it;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyString {
	public static void main(String[] args) {
   String str = "java is a programming language java is great programming language";
   
   Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).
   collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
   
  collect.forEach((k,v)->System.out.println(k+" "+v));
		
		
		// or
  Map<String, Long> collect2 = Arrays.stream(str.split("\\s+"))
  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
  
  collect2.forEach((x,y)->System.out.println(x+" "+y));
  
  
	}

}
