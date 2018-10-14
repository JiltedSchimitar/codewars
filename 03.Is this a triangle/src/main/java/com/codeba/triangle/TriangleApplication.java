package com.codeba.triangle;

/**
 * Implement a method that accepts 3 integer values a, b, c. The method should
 * return true if a triangle can be built with the sides of given length and
 * false in any other case.
 * 
 * (In this case, all triangles must have surface greater than 0 to be
 * accepted).
 * 
 * @author JiltedSchimitar
 *
 */

public class TriangleApplication {

	public static void main(String[] args) {

		int a = 7, b = 2, c = 2;
		
		System.out.println(TriangleTester.isTriangle(a, b, c));
	}
}
