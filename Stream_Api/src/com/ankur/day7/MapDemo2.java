package com.ankur.day7;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ankur","Anil","Roberts","Kunal","Ashok","Sunny","laila");
		
		//print name with its length which are starting with 'A' using Stream Api
		names.stream()
			.filter(name->name.startsWith("A")).
				map(name->name+" - "+name.length()).
					forEach(n->System.out.println(n));
	}

}
