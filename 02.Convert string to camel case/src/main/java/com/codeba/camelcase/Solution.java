package com.codeba.camelcase;

import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    
    StringBuilder builder = new StringBuilder(s.length());
    
    int count = 0;
		
		for(String word : s.split("-|_")) {
			
			System.out.println(word);
			
			if(!word.isEmpty()) {
				if (count == 0) {
					builder.append(word);
					count++;
				} else if (count >= 1) {
					builder.append(word.substring(0, 1).toUpperCase());
					builder.append(word.substring(1).toLowerCase());
				}
			}
		}
    
    return builder.toString();
  }
}