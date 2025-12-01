package com.ankur.day8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
 * in below example employee1 
 * will be grouped by country name
 */

class Employee1{
	Integer id;
	String name;
	Double salary;
	String country;
	public Employee1(Integer id,String name,Double salary,String country) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.country=country;
	}
	@Override
	public String toString() {
		return "Employee1 [id = "+id+", name = "+name+", salary = "+salary+", country = "+country+"]";
	}
	
}

public class GroupBy_Demo {
	public static void main(String[] args) {
		Employee1 e1 = new Employee1(101, "Ankur", 85000.23, "India");
		Employee1 e2 = new Employee1(102, "Prity", 75000.33, "USA");
		Employee1 e3 = new Employee1(103, "Manjulika", 15000.73, "UK");
		Employee1 e4 = new Employee1(104, "Raju", 25000.63, "China");
		Employee1 e5 = new Employee1(105, "Karun", 10000.33, "India");
		Employee1 e6 = new Employee1(106, "Satish", 55000.83, "UK");
		
		List<Employee1> employeeslist = Arrays.asList(e1,e2,e3,e4,e5,e6);
		Map<String, List<Employee1>> data = employeeslist.stream()
																.collect(Collectors.groupingBy(e->e.country));
		System.out.println(data);
	
	}

}
