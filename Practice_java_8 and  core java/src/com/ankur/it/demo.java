package com.ankur.it;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
	String name;
	Integer age;
	Double salary;
	String country;
	public Employee(String name , Integer age,Double salary,String country) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.country=country;
	}
	@Override
	public String toString() {
		return "Employee[name = "+name+", age = "+age+", salary = "+salary+", country = "+country+"]";
	}
	
}

public class demo {
	public static void main(String[] args) {
		Employee e1 = new Employee("Ankur Singh", 27, 55000.23,"India");
		Employee e2 = new Employee("Roberts", 37, 95000.23,"USA");
		Employee e3 = new Employee("David", 56, 15000.23,"India");
		Employee e4 = new Employee("Smith", 12, 70000.23,"China");
		Employee e5 = new Employee("Root", 17, 10000.23,"Maxico");
		Employee e6 = new Employee("Buttler", 19, 65000.23,"UK");
		
		List<Employee> empsall = Arrays.asList(e1,e2,e3,e4,e5,e6);
		Optional<Employee> max = empsall.stream().collect(Collectors.maxBy(Comparator.comparing(s->s.salary)));
		System.out.println(max.get().salary);
		empsall.stream().filter(x->x.salary>=50000).map(y->y.name).forEach(e->System.out.println(e));
		
		empsall.stream().filter(x->x.salary>=50000).forEach(x->System.out.println(x.name+" - "+x.salary));
		//Avg
		Double avgCollect = empsall.stream().collect(Collectors.averagingDouble(s->s.salary));
			System.out.println("Employee avg salary :: "+avgCollect);
			
			empsall.stream().filter(e->e.salary>=50000).map(x->x.name +" *** "+ x.age).
			forEach(y->System.out.println(y));

		
		
		
	}

}
