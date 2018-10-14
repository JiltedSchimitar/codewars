package com.codeba.dna;

import java.util.stream.Stream;

/**
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and
 * carries the "instructions" for the development and functioning of living
 * organisms.
 * 
 * If you want to know more http://en.wikipedia.org/wiki/DNA
 * 
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and
 * "G". You have function with one side of the DNA (string, except for Haskell);
 * you need to get the other complementary side. DNA strand is never empty or
 * there is no DNA at all (again, except for Haskell).
 * 
 * More similar exercise are found here http://rosalind.info/problems/list-view/
 * (source)
 * 
 * For example:
 * 
 * DnaStrand.makeComplement("ATTGC") // return "TAACG"
 * 
 * DnaStrand.makeComplement("GTAT") // return "CATA"
 * 
 * @author JiltedSchimitar
 *
 */

public class ComplimentaryDNA {

	public static void main(String[] args) {

		String dna = "ATTGC";

		StringBuilder sb = new StringBuilder(dna.length());

		for (char c : dna.toCharArray()) {

			switch (c) {

			case 'A':
				sb.append("T");
				break;

			case 'T':
				sb.append("A");
				break;
			case 'G':
				sb.append("C");
				break;
			case 'C':
				sb.append("G");
				break;
			}
		}
		
		System.out.println(sb.toString());
	}
}
