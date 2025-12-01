package com.ankur.day7;

import java.util.Arrays;
import java.util.List;

public class using_slicing_operation_limit_distinct_skip {
public static void main(String[] args) {
	List<String> javacourse = Arrays.asList("Core java","Spring","Spring Boot","Microservices","Advance Java","Jdbc","Restful Services");
	//using limit 1st 3 record print 
	//javacourse.stream().limit(3).forEach(s->System.out.println(s));
	
	
	//using skip ist 3 record 
	javacourse.stream().skip(3).forEach(x->System.out.println(x));
	List<String> names = Arrays.asList("Raja","Raja","Rani","Guru","Rani","Satish","Raja");
	// to remove duplicate & unique name
	names.stream().distinct().forEach(s->System.out.println(s));
}
}
