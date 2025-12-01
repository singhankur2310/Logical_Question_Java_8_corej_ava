package com.ankur.day3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
 * print emp name whoe are working Delhi
 * location in Db team
 */
class Employee{
	String name;
	String location;
	String dept;
	public Employee(String name, String location, String dept) {
		super();
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
}
public class prdeicate_join_demo {
	public static void main(String[] args) {
		Employee e1 = new Employee("Ankur", "Delhi", "DB");
		Employee e2 = new Employee("Anushka", "Mumbai", "Devops");
		Employee e3 = new Employee("prity", "Delhi", "DB");
		Employee e4 = new Employee("Ganesh", "Pune", "Developer");
		Employee e5 = new Employee("Raju", "Indore", "tester");
		
		List<Employee> emps = Arrays.asList(e1,e2,e3,e4,e5);
		
		Predicate<Employee> pr1 = (e)->e.location.equals("Delhi");
		Predicate<Employee> pr2 = (e)->e.dept.equals("DB");
		Predicate<Employee> pr3 = (e)->e.name.startsWith("A");
		//predicate joining pr1 and pr2 and pr3
		Predicate<Employee> pr = pr1.and(pr2).and(pr3);
		
		for(Employee e : emps) {
			if(pr.test(e)) {
				System.out.println(e.name);
				
			}
		}
		
 	
	}

}
