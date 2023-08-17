package com.swapna;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stackqueue {
		
	//Stack,Queue -> we cant remove in between elements
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Last in first out
		Stack<Integer> stk = new Stack<>();
		stk.push(2);
		stk.push(4);
		stk.push(3);
		stk.push(5);
		stk.push(4);
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
		
		
		//First in First out
		Queue<Integer> que = new LinkedList<>();
		que.offer(2);
		que.add(5);
		que.add(3);
		que.add(4);
		que.add(7);
		que.add(7);
		System.out.println(que);
		que.remove();
		System.out.println(que);
		
		
		
		
	}

}
