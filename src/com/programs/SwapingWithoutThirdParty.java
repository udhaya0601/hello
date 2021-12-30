package com.programs;

public class SwapingWithoutThirdParty {
public static void main(String[] args) {
	int a=120;
	int b=123;
	System.out.println("before swaping");
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("after swaping");
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	
}
}
