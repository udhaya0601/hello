package com.programs;

public class Counts {
	public static void main(String[] args) {
		String s="Udhayasankar@0601";
		int uppercount=0, lowercount=0,numbercount=0,splchar=0;
		int length = s.length();
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
		if (Character.isUpperCase(c)) {
			uppercount++;
			
		}	else if (Character.isLowerCase(c)) {
			lowercount++;
			
		}else if (Character.isDigit(c)) {
			numbercount++;
		}else {
			splchar++;
		}
		
			
		}
		
		
		System.out.println(uppercount);

		System.out.println(lowercount);
		System.out.println(numbercount);
		System.out.println(splchar);
		}

}
