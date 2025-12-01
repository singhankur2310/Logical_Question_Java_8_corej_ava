package com.ankur.it.p2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private int id ;
	private String name;
	private double salary;
	
	
	public Employee(int id ,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	//setter getter
	
	public void setId(int id ) {
		this.id =id;
	}
	public int getId() {
	return id;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employeee[id ="+id+"name ="+name+"salary = "+salary+"]";
	}
	
	
	
	
}

public class test_ {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ankur", 55000.02);
		Employee e2 = new Employee(2, "Radhika", 75000.02);
		Employee e3 = new Employee(3, "Prity", 65000.02);
		Employee e4 = new Employee(4, "Savita", 95000.02);
		Employee e5 = new Employee(5, "Raju", 5000.02);
		List<Employee> emplist = Arrays.asList(e1,e2,e3,e4,e5);
		
		
		//2nd highest salary
		List<Employee> collect = emplist.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).
		collect(Collectors.toList());
		System.out.println(collect.get(1).getSalary());
		
		
	}

}
