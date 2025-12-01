package com.ankur.day7;

import java.util.Arrays;
import java.util.List;

class Person{
	
	String name;
	String country;
	public Person(String name,String country) {
		this.name=name;
		this.country=country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
}

public class MatchingOpertionDemo {
	public static void main(String[] args) {
		Person p1 = new Person("Ankur", "India");
		Person p2 = new Person("Roberts", "USA");
		Person p3 = new Person("Smith", "Uk");
		Person p4 = new Person("Roser", "China");
		Person p5 = new Person("ching", "Japan");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		
		// using anyMatch() check condition true are false at least 1 record match output is true
		boolean status1 = persons.stream().anyMatch(p->p.country.equals("India"));
		System.out.println("Any Indian Avilabe ? :: "+status1);
		
		boolean status2 = persons.stream().anyMatch(p->p.country.equals("Canada"));
		System.out.println("Any Canada Avilabe ? :: "+status2);
		
		// using allMatch() check condition all record match output is true nahi to false
		boolean status3 = persons.stream().allMatch(x->x.country.equals("Inida"));
		System.out.println("All Persons from India :: "+status3);
		
		//using noneMatch() no persons maxico output is true
		boolean status4 = persons.stream().noneMatch(x->x.country.equals("Maxico"));
		System.out.println("No Persons  from Maxico :: "+status4);
		
	}

}
