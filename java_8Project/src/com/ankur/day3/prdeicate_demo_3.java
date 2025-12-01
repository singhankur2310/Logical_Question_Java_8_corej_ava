package com.ankur.day3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 *list of person and print persons whose
 *age is>=18 using Lambda Expression
 * 
 */
class Person{
	String name;
	int age;
	public Person(String name,int age) {
		// TODO Auto-generated constructor stub
	this.name=name;
	this.age=age;
	}
	/*@Override
	public String toString() {
		return "Person [name = "+name+" , age ="+age+"]";
	}*/
}

public class prdeicate_demo_3 {
	public static void main(String[] args) {
		Person p1 = new Person("Ankur", 27);
		Person p2 = new Person("Raja", 17);
		Person p3 = new Person("Rani", 14);
		Person p4 = new Person("Jyoti", 36);
		Person p5 = new Person("Juhi", 65);
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		Predicate<Person> pr = p->p.age >= 18;
		for(Person person : persons) {
			if(pr.test(person)) {
				System.out.println(person.name);
			}
			
		}
	}

}
