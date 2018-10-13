package com.codeba.camelcase;

/**
 * Complete the method/function so that it converts dash/underscore delimited
 * words into camel casing. The first word within the output should be
 * capitalized only if the original word was capitalized.
 * 
 * For example:
 * _______________________________________________________________________________________________
 * | 																							  | 
 * |toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"							  |
 * | 																							  | 
 * |toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior" 							  |
 * |______________________________________________________________________________________________|
 * 
 * @author JiltedSchimitar
 *
 */

public class CamelCase {

	public static void main(String[] args) {

		String input = "left-Street-Wall-Street-Street-Rockstar-Street-left-side";

		StringBuilder builder = new StringBuilder(input.length());

		int count = 0;

		for (String word : input.split("-|_")) {

			if (!word.isEmpty()) {

				if (count == 0) {

					builder.append(word);

					count++;
				} else if (count >= 1) {
					builder.append(word.substring(0, 1).toUpperCase());
					builder.append(word.substring(1).toLowerCase());
				}
			}
		}

//		System.out.println(builder.toString());
		
		System.out.println(new Solution1().toCamelCase(input));
	}
}
