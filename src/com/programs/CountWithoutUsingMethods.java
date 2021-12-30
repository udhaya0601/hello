package com.programs;

public class CountWithoutUsingMethods {
	public static void main(String[] args) {
		String s="Udhayasankar@0601";
		int uppercount=0, lowercount=0,numbercount=0,splchar=0;
		int length = s.length();
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			int x=c;
			if (x>=65 && x<=90) {
				uppercount++;
				
			}else if (x>=97 && x<=122) {
				lowercount++;
				
			}else if (x>=48 && x<=57) {
				numbercount++;
				
				
			}else {
				splchar++;
			}
			
		}
		
		
		

		System.out.println("upper count= " + uppercount);

		System.out.println("lower count= " + lowercount);
		System.out.println("number count= " + numbercount);
		System.out.println("spl char= " + splchar);
		
		
		
		
		
		
	}

}
