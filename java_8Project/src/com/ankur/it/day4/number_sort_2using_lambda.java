package com.ankur.it.day4;
import java.util.ArrayList;
import java.util.Collections;

//Approach -2 using lambda
public class number_sort_2using_lambda {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(8);
		al.add(1);
		al.add(98);
		System.out.println("Before sort :: "+al);
		//using lambda expression java 8
		Collections.sort(al,(i,j)->i.compareTo(j));
		//Ascending order by Default
		System.out.println("After sorting :: "+al);
		//Descending order
		Collections.sort(al,(i,j)->(i>j)?-1:1);
		System.out.println("After sorting :: "+al);
	}

}
