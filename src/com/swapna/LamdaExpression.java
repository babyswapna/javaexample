package com.swapna;

import java.util.List;

public class LamdaExpression {
		
//	public static boolean filter1(int a)	{
//		if(a==2) {
//			System.out.println(a);
//			
//		}
//		return a==2;
//		
//		
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst = List.of(2,3,4,5,6);
		//System.out.println(lst);
		//lst.stream().filter(LamdaExpression::filter1);
		//.forEach(System.out::println);
		
		lst.stream().filter(a->a%2 == 0).map(lsts ->lsts*2).forEach(System.out::println);

	}

}
