package com.ankur.day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class flatmapDemo {
	public static void main(String[] args) {
		
	List<String> javacourse = Arrays.asList("Core java","Spring","Spring Boot","Microservices","Advance Java","Jdbc");
	List<String> uicourse = Arrays.asList("Html","css","bootstrap","javascript","Angular","typeScript");
	
	
	List<List<String>> courses = Arrays.asList(javacourse,uicourse);
	
	//courses.stream().forEach(c->System.out.println(c));
	Stream<String> fms = courses.stream().flatMap(s->s.stream());
	fms.forEach(s->System.out.println(s));
	}
}
