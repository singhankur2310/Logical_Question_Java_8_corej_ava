package com.ankur.day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * WAJP to get MAX,MIN and AVG
 * salary from given Employee data
 * using Stream Api
 */
class Employee{
	Integer id;
	String name;
	Integer age;
	Double salary;
	public Employee(Integer id,String name,Integer age,Double salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}
public class salary_max_min_avg_findDemo {
			public static void main(String[] args) {
				Employee e1 = new Employee(1,"Ankur", 27, 85000.01);
				Employee e2 = new Employee(2,"Raju", 18, 15000.39);
				Employee e3 = new Employee(3,"Elvaish", 21, 65000.51);
				Employee e4 = new Employee(4,"Reena", 28, 12000.41);
				Employee e5 = new Employee(5,"Kajol", 47, 55000.32);
				Employee e6 = new Employee(6,"Anushkha", 37, 33000.77);
				
				List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5,e6);
				
				 Stream<Employee> stream = Stream.of(e1,e2,e3,e4,e5,e6);//only one operation at the time using stream.of() method
				 //MAX
				 Optional<Employee> max = stream.collect(Collectors.maxBy(Comparator.comparing(s->s.salary)));
				 System.out.println("Max salary :: "+max.get().salary);
				 // MIN
				 Optional<Employee> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
				 System.out.println("Min salary :: "+min.get().salary);
				 //AVG
				 Double avg = list.stream().collect(Collectors.averagingDouble(e->e.salary));
				 System.out.println("AVG Salary :: "+avg);
			Optional<Employee> collect = list.stream().collect(Collectors.maxBy(Comparator.comparing(s->s.salary)));
			System.out.println(collect.get().salary);
			}
}
