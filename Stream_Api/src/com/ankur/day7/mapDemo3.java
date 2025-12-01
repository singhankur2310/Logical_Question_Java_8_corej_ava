package com.ankur.day7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * WAJP to get the employee name 
 * and emp age whose salary is >=50000
 * print Emp name with Emp age whose salary is 
 * >=50000 using stream api
 * 
 */
class Employee{
	private String name;
	private Integer age;
	private Double salary;
	
	public Employee(String name,Integer age,Double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	
}
public class mapDemo3 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Ankur", 27, 65000.02);
		Employee e2 = new Employee("Ashok", 37, 85000.02);
		Employee e3 = new Employee("Majulika", 38, 15000.23);
		Employee e4 = new Employee("Srinivas",32 , 35000.88);
		Employee e5 = new Employee("Raju", 27, 50000.23);
		Employee e6 = new Employee("Sitesh", 27, 15000.32);
	
	  Stream<Employee> empStream = Stream.of(e1,e2,e3,e4,e5,e6);
	  
	// 1 st way	with map
		/*empStream.filter(i -> i.getSalary() >= 50000)
		.map(n->n.getName() +"  "+n.getAge()).
		forEach(n->System.out.println(n));
		*/
	  
		// 2nd way without map use
		empStream.filter(j->j.getSalary() >= 50000).forEach(e->System.out.println(e.getName()+" "+e.getAge()));
	}

}
