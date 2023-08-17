package com.swapna;

public class Addition {
	
	public static void swapna(int age, int year) {
	
		System.out.println(age+year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swapna(10,20);
		
		int a =10;
		int b = 20;
		
		a = a+b;
		//a = a+b;
		b= a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
