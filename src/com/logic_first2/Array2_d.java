package com.logic_first2;

public class Array2_d {  // 2d array is nothing but a array of arrays

	public static void main(String[] args) {
		
		int A [][]= new int [3][4]; // 3 is num of rows it creates 3 one d array , 4 is numb of column, we can store 4 students marks totally 12 students marks
		// or int [][] A = new int [][];
		
		// char [] c1,c2,c3,c4;
		// new char 
		// 
		// that [] [] --> 2d array. the number inside first bracket nothing to do with dimension
		//  2d is a array of arrays
		A[0][0] = 85;
		
		A[2][3] = 87;
		
		System.out.println("data at A[2][3] ==="+ A[2][3]);
		
		System.out.println("data at A[2][1] ==="+ A[2][1]);
		

	}

}
