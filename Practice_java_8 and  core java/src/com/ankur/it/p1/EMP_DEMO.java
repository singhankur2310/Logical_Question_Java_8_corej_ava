package com.ankur.it.p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	private Integer eid;
	private String name;
	private String department;
	private Integer age;
	private String gender;
	private Integer yearOfJoining;
	private Double salary;
	
	public Employee(Integer eid ,String name,String department,Integer age,String gender,Integer yearOfJoining,Double salary) {
		this.eid = eid;
		this.name=name;
		this.department=department;
		this.age=age;
		this.gender=gender;
		this.yearOfJoining=yearOfJoining;
		this.salary=salary;
	}
	public void setEid(Integer eid) {
		this.eid=eid;
		
	}
	public Integer getEid() {
		return eid;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setDepartment(String department) {
		this.department =  department;
		
	}
	
	public String getDepartment() {
		return department;
	}
	public void setAge(Integer age) {
		this.age=age;
		
	}
	public Integer getAge() {
		return age;
	}
	public void setGender(String gender) {
		this.gender=gender;
		
	}
	public String getGender() {
		return gender;
	}
	public void setYearOfJoinning(Integer yearOfJoining) {
		this.yearOfJoining=yearOfJoining;
	}
	public Integer getYearOfJoining() {
		return yearOfJoining;
	}
	public void setSalary(Double salary) {
		this.salary=salary;
	}
	public Double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "[Eid = "+eid+", Name = "+name+", Department = "+department+", Age = "
				+ ""+age+", Gender = "+gender+", YearOfJoining = "+yearOfJoining+","
						+ " Salary = "+salary+"]";
		
	}
}

public class EMP_DEMO {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Ankur Singh","Developer" ,27, "Male", 2022, 77000.02);
		Employee e2 = new Employee(102, "Rohini", "Marketing" ,31, "Female", 2020, 37000.02);
		Employee e3 = new Employee(103, "Rashmika", "Sales" ,28, "Female", 2019, 42000.02);
		Employee e4 = new Employee(104, "Prity", "Developer" ,26, "Female", 2018, 58000.02);
		Employee e5 = new Employee(105, "Majulika", "QA" ,46, "Female", 2011, 98000.02);
		Employee e6 = new Employee(106, "Rahul", "QA" ,57, "Male", 2010, 83000.02);
		Employee e7 = new Employee(107, "Sanjay", "Sales" ,23, "Male", 2024, 15000.02);
		Employee e8 = new Employee(108, "Riya", "HR" ,18, "Female", 2025, 12000.02);
		Employee e9 = new Employee(109, "Ashok","Developer" , 21, "Male", 2023, 50000.02);
		Employee e10 = new Employee(110, "Maya", "HR" ,32, "Feamle", 2017, 52000.02);
		Employee e11 = new Employee(111, "Sonakshi", "QA" ,28, "Female", 2016, 35000.02);
		Employee e12 = new Employee(112, "Ratan","Marketing" , 27, "Male", 2022, 18000.02);
		Employee e13 = new Employee(113, "Nihal", "Tester" ,26, "Male", 2024, 14000.02);
		// 2nd Highest salary
		List<Employee> emps = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13);
		Optional<Employee> secSemps = emps.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
		if(secSemps.isPresent()) {
			System.out.println(secSemps.get().getSalary());
		}
		// 2nd way
		
		List<Employee> collect = emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).
				collect(Collectors.toList());
		System.out.println(collect.get(1).getName());
		
		// maximum salary for employee
		Optional<Employee> collect2 = emps.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		if(collect2.isPresent()) {
			System.out.println(collect2.get());
		}
		//maximum salary female employee
		
		Optional<Employee> collect3 = emps.stream().filter(fe->fe.getGender().equals("Female")).
											collect(Collectors.maxBy(Comparator.comparing(e->e.getSalary())));
		
		if(collect3.isPresent()) {
			System.out.println(collect3.get().getName());
		}
		
		//Average salary for female employee
		Map<String, Double> collect4 = 
				emps.stream().filter(e->e.getGender().equals("Female")).
				collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collect4);
		// how many employee in each department
		Map<String, Long> collect5 = emps.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(collect5);
		// Average Salary of each Department
		Map<String, Double> collect6 = emps.stream().
				collect(Collectors.
						groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collect6);
		
		
	}

}
