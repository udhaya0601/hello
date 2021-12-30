package com.programs;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s="hai hello welcome ";
		String[] split = s.split(" ");
		String op="";
		for (String es : split) {
			String rev="";
			for (int i = es.length()-1; i>=0; i--) {
				char c = es.charAt(i);
								
				rev=rev+c+"";
			}
			
			op=op+rev+" ";
		}
		System.out.println(op);
		}
		
		
		
	}


