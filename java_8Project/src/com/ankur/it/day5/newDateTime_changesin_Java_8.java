package com.ankur.it.day5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class newDateTime_changesin_Java_8 {

	public static void main(String[] args) {
		
		LocalDate of = LocalDate.of(2021, 01, 20);
		System.out.println(of);
		 
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate plusDays = date.plusDays(3);
		System.out.println(plusDays);
		
		LocalDate plusMonths = date.plusMonths(1);
		System.out.println(plusMonths);
		
		LocalDate plusWeeks = date.plusWeeks(2);
		System.out.println(plusWeeks);
		
		LocalDate plusYears = date.plusYears(3);
		System.out.println(plusYears);
		
		boolean leapYear = LocalDate.parse("2020-01-16").isLeapYear();
		System.out.println("Lead Year :: "+leapYear);
		
		boolean before = LocalDate.parse("2020-01-16").isBefore(LocalDate.parse("2025-01-16"));
		System.out.println("Before date :: "+before);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		time.plusHours(2);
		System.out.println(time);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		//period is used to compare the date
		Period between = Period.between(LocalDate.parse("1997-11-26"), LocalDate.now());
		System.out.println(between);
		System.out.println(between.getYears());
		
		//Duration is used to compare the time
		Duration duration = Duration.between(LocalTime.parse("10:00"), LocalTime.now());
		System.out.println(duration);
		
	}
	
	
	
}
