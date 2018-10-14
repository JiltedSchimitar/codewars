package com.codeba.sum;

import java.util.Arrays;

public class Sum {
	public int GetSum(int a, int b) {
		int[] numbers = { a, b };

		Arrays.sort(numbers);

		int sum = 0;

		for (int i = numbers[0]; i <= numbers[1]; i++) {

			sum += i;
		}

		return sum;
	}
}