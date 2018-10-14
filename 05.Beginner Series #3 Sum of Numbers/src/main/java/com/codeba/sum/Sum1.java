package com.codeba.sum;

import java.util.stream.IntStream;

public class Sum1 {

	public static int getSum(int a, int b) {
		
		return IntStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
	}
}
