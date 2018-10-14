package com.codeba.sum;

import java.util.Arrays;

/**
 * Given two integers a and b, which can be positive or negative, find the sum
 * of all the numbers between including them too and return it. If the two
 * numbers are equal return a or b.
 * 
 * Note: a and b are not ordered!
 * 
 * For example: 
 * 
 * GetSum(1, 0) == 1 // 1 + 0 = 1 
 * GetSum(1, 2) == 3 // 1 + 2 = 3
 * GetSum(0, 1) == 1 // 0 + 1 = 1 
 * GetSum(1, 1) == 1 // 1 Since both are same
 * GetSum(-1, 0) == -1 // -1 + 0 = -1 
 * GetSum(-1, 2) == 2 // -1 + 0 + 1 + 2 = 2
 * 
 * @author JiltedSchimitar
 *
 */

public class SumApplication {

	public static void main(String[] args) {

		int[] numbers = {1, 1};
		
		Arrays.sort(numbers);
		
		int sum = 0;
		
		for(int i = numbers[0]; i<=numbers[1]; i++) {
			
			sum += i;
		}
		
//		System.out.println(sum);
		
		System.out.println(Sum1.getSum(1, 1));
	}
}
