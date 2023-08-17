package com.swapna;

import java.util.Arrays;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 3;
		int coln = 3;
		int values = 1;
		int[][] mat = new int[rows][coln];
		
		for(int i= 0; i<rows;i++) {
			for(int j = 0; j<coln;j++) {
				mat[i][j] = values;
				values++;
			}
		}
		
		
		for(int i= 0; i<rows;i++) {
			for(int j = 0; j<coln;j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println(" ");
		}
	}

}


