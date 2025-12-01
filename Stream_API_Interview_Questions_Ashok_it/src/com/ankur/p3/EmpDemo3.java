package com.ankur.p3;

import java.util.*;
import java.util.stream.*;

class Employee{
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	
	
	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
	
	
}

public class EmpDemo3 {
	public static void main(String[] args) {
		
		List<Employee> emps = new ArrayList<Employee>();
		
		
		emps.add(new Employee(1, "Ankur Singh", 27,"Male", "Development", 2021, 65000.02));
		emps.add(new Employee(2, "Prity", 30,"Female", "Development", 2015, 85000.02));
		emps.add(new Employee(3, "Sonam", 35,"Female", "Testing", 2019, 35000.23));
		emps.add(new Employee(4, "Ravi", 45,"Male", "HR", 2012, 25000.32));
		emps.add(new Employee(5, "Saurabh", 51,"Male", "Sales", 2013, 75000.02));
		emps.add(new Employee(6, "Anjali", 38,"Female", "Finance", 2012, 95000.52));
		emps.add(new Employee(7, "Kajol", 19,"Female", "Development", 2022, 15000.12));
		emps.add(new Employee(8, "Rohit", 17,"Male", "Testing", 2023, 12000.99));
		emps.add(new Employee(9, "Avinash", 33,"Male", "Security", 2021, 23000.02));
		emps.add(new Employee(10, "Rajkumar", 60,"Male", "Finance", 2011, 105000.02));
		emps.add(new Employee(11, "Alia", 35,"Female", "Sales", 2021, 35000.82));
		emps.add(new Employee(12, "Karina", 32,"Female", "HR", 2024, 18000.32));
		emps.add(new Employee(13, "Ruby", 24,"Female", "Security", 2025, 75000.22));
		emps.add(new Employee(14, "Sanjay", 38,"Male", "Development", 2024, 95000.02));
		emps.add(new Employee(15, "Suresh", 21,"Male", "HR", 2020, 38000.52));
		emps.add(new Employee(16, "Chandan", 37,"Male", "Development", 2021, 74000.82));
		emps.add(new Employee(17, "Rajesh", 45,"Male", "Security", 2021, 15000.62));
		emps.add(new Employee(18, "Rabina", 48,"Female", "Marketing", 2021, 23000.33));
		emps.add(new Employee(19, "Suresh", 32,"Male", "HR", 2021, 100000.92));
		emps.add(new Employee(20, "Ritesh", 42,"Male", "Devops", 2022, 74000.32));
		emps.add(new Employee(21, "Abhi", 29,"Male", "Marketing", 2021, 47000.22));
		
		//8 Get the details of Youngest male employee in the development department
		
		Optional<Employee> optional = emps.stream().
		filter(e->e.getGender().equals("Male") && e.getDepartment().equals("Development")).
		min(Comparator.comparing(Employee::getAge));
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
			
		}
		
		System.out.println("***********\n");
		//9 who has the most working Highest experience in the organization
		
		Optional<Employee> collect = emps.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		if(collect.isPresent()) {
			System.out.println(collect.get());
			
		}
		//10 How many male and Female Employee are there in the sales team?
		System.out.println("*****************\n");
		Map<String, Long> map = emps.stream().filter(e->e.getDepartment().equals("Sales")).
				collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(map);
		
		//11 
		
	}

}
