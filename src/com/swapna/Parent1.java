package com.swapna;

public class Parent1 implements ParentInterface {
	
public static void main(String[] args) {
	Parent1 par =new Parent1();
	par.parent1();
	System.out.println(par.Sparent());
	
}

@Override
public void parent1() {
	// TODO Auto-generated method stub
	System.out.println("Yes Parent");
	
}

@Override
public String Sparent() {
	// TODO Auto-generated method stub
	return "swap";
}
}
