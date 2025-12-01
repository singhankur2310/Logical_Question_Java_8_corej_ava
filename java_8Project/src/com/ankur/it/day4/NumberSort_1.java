package com.ankur.it.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
//perform sorting descending order using normal
public class NumberSort_1 {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	al.add(404);
	al.add(101);
	al.add(707);
	al.add(303);
	al.add(808);
	System.out.println("Before Sorting -> "+al);
	Collections.sort(al,new numberComparator());
	System.out.println("After Sorting -> "+al);
	
}
}
class numberComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i, Integer j) {
		if(i > j) {
			return -1;
		}else if(i < j) {
			return 1;
			
		}
			return 0;
		
		
	}
	
}
