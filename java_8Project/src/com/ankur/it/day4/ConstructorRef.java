package com.ankur.it.day4;

import java.util.function.Supplier;

import javax.print.Doc;

class Doctor{
	public Doctor() {
		System.out.println("Doctor Constructor....");
	}
	public Doctor(int i) {
		System.out.println("Doctor Constructor....");
	}
	
}
public class ConstructorRef {
	public static void main(String[] args) {
		Doctor d = new Doctor();
	Supplier<Doctor> s=	Doctor::new;
	System.out.println(s.get().hashCode());
		
	}
	

}
