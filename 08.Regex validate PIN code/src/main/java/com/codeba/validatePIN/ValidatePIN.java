package com.codeba.validatePIN;

/**
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain
 * anything but exactly 4 digits or exactly 6 digits.
 * 
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * For example: 
 * 
 * Solution.validatePin("1234") === true
 * Solution.validatePin("12345") === false 
 * Solution.validatePin("a234") === false
 * 
 * @author JiltedSchimitar
 *
 */

public class ValidatePIN {

	public static void main(String[] args) {

		String pin = "123456";

		System.out.println(pin.matches("[0-9]{4}") | pin.matches("[0-9]{6}"));

	}
}
