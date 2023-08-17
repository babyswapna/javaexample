package com.swapna;

public class Overloading {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading over=new Overloading();
		System.out.println(over.Yes(33, 23));

	}
	
	public String Yes(long b) {
		return "2nd"+b;
	}
	
public String Yes(int a, int b) {
	return "1st"+a+b;
}

public String Yes(double c) {
	return "3rd"+c;
}

}
