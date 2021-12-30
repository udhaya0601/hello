package com.programs;

public class StringReverse {

	public static void main(String[] args) {
		
	
		String s="Udhayasankar";
		String rev=" ";
		int length = s.length();
		System.out.println(length);
		for (int i =length-1 ; i >=0; i--) {
			rev=rev+s.charAt(i);
			
			
		}
		System.out.println(rev);
	}



}
