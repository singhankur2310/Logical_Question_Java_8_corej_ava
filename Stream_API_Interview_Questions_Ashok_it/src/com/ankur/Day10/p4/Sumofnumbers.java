package com.ankur.Day10.p4;

import java.util.Arrays;

/*Stream reduce concept                                                                                                                                       
 * sum of numbers 
 */
public class Sumofnumbers {
	public static void main(String[] args) {
		int[]nums = {1,2,3,4,5};
		
		//1st way normal logic
		int sum =0;
		for(int i : nums) {
			sum = sum+i;
			
		}
		System.out.println(sum);  
		
		// 2nd way using  stream reduce
		int reduce = Arrays.stream(nums).reduce(0,(a,b)->a+b);
		System.out.println(reduce);
		
	}

}
