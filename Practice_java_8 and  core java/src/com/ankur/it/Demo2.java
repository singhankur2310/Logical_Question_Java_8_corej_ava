package com.ankur.it;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee1{
	
	Integer id;
	String name;
	Double salary;
	String department;
	String gender;
	Integer yearOfJoining;
	String city;
	
	
	
	public Employee1(Integer id, String name, Double salary, String department, String gender,Integer yearOfJoining, String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.gender=gender;
		this.yearOfJoining = yearOfJoining;
		this.city = city;
	}

	
	


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public Integer getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(Integer yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}





	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", Gender = "+gender+", yearOfJoining=" + yearOfJoining + ", city=" + city + "]";
	}
	
	
	
}


public class Demo2 {
			public static void main(String[] args) {
			 Employee1 e1 = new Employee1(1, "Diya", 47000.21,"sales","Female", 2015, "Mumbai");
			 Employee1 e2 = new Employee1(2, "RUpesh", 77000.21, "QA","Male",2012, "Pune");
			 Employee1 e3 = new Employee1(3, "Kanika", 95000.21, "Developer","Female",2010, "Bhoapl");
			 Employee1 e4 = new Employee1(4, "Sonam", 18000.21, "Marketing","Female",2019, "Gurugao");
			 Employee1 e5 = new Employee1(5, "Ankur", 55000.21,"Developer","Male",2025, "Noida");
			 Employee1 e6 = new Employee1(6, "Roli", 13000.21, "HR","Female",2018, "Mumbai");
			 Employee1 e7 = new Employee1(7, "Prity", 38000.21, "Developer","Female",2010, "Noida");
			 Employee1 e8 = new Employee1(8, "Komal", 32000.21, "QA","Female",2016, "Delhi");
			 Employee1 e9 = new Employee1(9, "Radhika", 65000.21, "HR","Female",2021, "Pune");
			 
			 List<Employee1> emps = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9);
			 // 2nd highest salary
			 //1st way
			 Optional<Employee1> empsecond = emps.stream().
					 							sorted(Comparator.comparingDouble(Employee1::getSalary)
					 							.reversed()).
					 							skip(1).
					 							findFirst();
			 if(empsecond.isPresent()) {
				 System.out.println(empsecond.get().salary);
				 
			 }
			// 2nd way
			 List<Employee1> empsec = emps.stream().sorted(Comparator.comparing(Employee1::getSalary).reversed())
			 .collect(Collectors.toList());
			 System.out.println(empsec.get(1).salary);
			 //3 :- which employee in Noida location

			 emps.stream().filter(e->e.getCity().equals("Noida")).map(n->n.name).
			 forEach(x->System.out.println(x));
			 
			 // 4 :-how many department in company
			 Map<String, Long> collect = emps.stream().
					 collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.counting()));
			 System.out.println(collect);
			 
			//average salary for each employee
			 Double collect2 = emps.stream().collect(Collectors.averagingDouble(e->e.getSalary()));
			 System.out.println(collect2);
			 //highest paid amount in employee 
			 Optional<Employee1> collect3 = emps.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getSalary())));
			 
			 if(collect3.isPresent()) {
				 System.out.println(collect3.get().getName()+" - "+collect3.get().salary);
			 }
			 //minimum salary of employee in organization
			 
			 Optional<Employee1> collect4 = emps.stream().collect(Collectors.minBy(Comparator.comparing(x->x.getSalary())));
			 if(collect4.isPresent()) {
				 System.out.println(collect4.get());
			 }
			 //max SALARY
			 Optional<Employee1> collect5 = emps.stream().collect(Collectors.maxBy(Comparator.comparingDouble(e->e.getSalary())));
			 if(collect5.isPresent()) {
				 System.out.println(collect5.get().salary);
				 
			 }
			 // how many male and female employee
			 Map<String, Long> collect6 = emps.stream().collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting()));
			 System.out.println(collect6);
			 
			 //average salary of each department
			 
			 Map<String, Double> collect7 = emps.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.averagingDouble(e->e.getSalary())));
			 System.out.println(collect7);
			 
			 collect7.forEach((i,j)->System.out.println("Department = "+i+" ,Average Salary = "+j));
			 
			 Optional<Employee1> collect8 = emps.stream().collect(Collectors.minBy(Comparator.comparing(Employee1::getYearOfJoining)));
			 if(collect8.isPresent()) {
				 System.out.println(collect8.get());
			 }
			 
			 
				
			}
			
			
}
