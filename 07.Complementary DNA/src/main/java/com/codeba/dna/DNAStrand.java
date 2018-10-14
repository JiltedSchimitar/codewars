package com.codeba.dna;

public class DNAStrand {

	public static String makeComplement(String dna) {
		
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

		return sb.toString();
	}
}
