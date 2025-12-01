package com.ankur.day7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
/*
 * i will give we list of 
 * persons with name and country
 * if any 'India' available in collection 
// * print the person 
 */

class Person1{
	
	String name;
	String country;
	public Person1(String name,String country) {
		this.name=name;
		this.country=country;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", country=" + country + "]";
	}
	
}

public class matchingOperationDemo2 {
	public static void main(String[] args) {
		Person1 p1 = new Person1("Ankur", "India");
		Person1 p2 = new Person1("Roberts", "USA");
		Person1 p3 = new Person1("Smith", "Uk");
		Person1 p4 = new Person1("Roser", "China");
		Person1 p5 = new Person1("ching", "Japan");
		Person1 p6 = new Person1("Suraj", "India");
		
		List<Person1> persons1 = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		// we don't print the data  get all 'India' record to get one list or collect or collect
		/*Optional<Person1> findFirst = persons1.stream()
		.filter(p -> p.country.equals("India"))	
		.findFirst();
		if(findFirst.isPresent()) {
		System.out.println(findFirst.get());
		}*/
		
		
		//this problem is use in collectors to collect the data
		/*List<Person1> inidans = persons1.stream()
			.filter(p->p.country.equals("India"))
			.collect(Collectors.toList());
		System.out.println(inidans.size());
		inidans.forEach(p->System.out.println(p));*/
		
		
		// collect names of person who are belongs to India and store into names collection
		
		List<String> collect1 = persons1.stream()
											.filter(p->p.country.equals("India"))
											.map(p->p.name)
											.collect(Collectors.toList());
		System.out.println(collect1);
		
		/*List<Person1> collect = persons1.stream().filter(p->p.country.equals("India")).collect(Collectors.toList());
		
		collect.forEach(x->System.out.println("Persons are belongs to Inida :: "+x.name));*/
		
	}

}
