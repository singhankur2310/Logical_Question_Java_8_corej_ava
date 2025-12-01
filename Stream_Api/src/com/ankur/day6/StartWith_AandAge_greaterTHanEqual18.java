package com.ankur.day6;

import java.util.stream.Stream;
class Employee{
	String name;
	int age;
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
}

public class StartWith_AandAge_greaterTHanEqual18 {
	public static void main(String[] args) {	
		Employee e1 = new Employee("Ankur",27);
		Employee e2 = new Employee("Raju",38);
		Employee e3 = new Employee("Sanju",12);
		Employee e4 = new Employee("Robert",18);
		Employee e5 = new Employee("Rani",8);
		Employee e6 = new Employee("Srivali",35);
		Employee e7 = new Employee("Supriya",38);
	
	Stream<Employee> stream = Stream.of(e1,e2,e3,e4,e5,e6,e7);
	//find age >= 18
	//stream.filter(u->u.age>=18).forEach(u->System.out.println(u));
	
	//Approach - 1 find age greater than equal to 18 and start with 'A'
	//stream.filter(e->e.name.startsWith("A") && e.age >= 18).forEach(e->System.out.println(e));
	
	//Approach - 2 find age greater than equal to 18 and start with 'A'
	stream.filter(e->e.age>=18).
	filter(l->l.name.startsWith("A"))
	.forEach(k->System.out.println(k));
	
	
	}

}
