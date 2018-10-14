package com.codeba.walk;

public class TenMinWalk {

	public static boolean isValid(char[] walk) {
		
		String str = new String(walk);
		
		return str.chars().filter(s -> s=='n').count()==str.chars().filter(s -> s=='s').count() &
			   str.chars().filter(s -> s=='e').count()==str.chars().filter(s -> s=='w').count() &
			   str.chars().count()==10;
	}
}
