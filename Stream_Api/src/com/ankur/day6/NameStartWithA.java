package com.ankur.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javax.sql.rowset.Predicate;

public class NameStartWithA {
	/*
	create one arraylist add string value name start with 'A'
	 */
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Virat","Rohit","Anushkha","Bablu","Ankur","juhi","Archana");
		
		
		//start with 'A' using Stream Api
		names.stream().filter(i->i.startsWith("A")).forEach(i->System.out.println(i));
		
	}

}
