package com.logic_first;
//1 dimensional array

public class Array1_d {

	public static void main(String[] args) {
		int marks [];
		// or int marks[] = new INT [8];
		// OR int [] marks = new int [6];
		marks = new int[7];  /// or we can use int marks[] = new int [8] 0r int [] mark = new int [8]
		
		
		marks[0] = 95;
		marks[1] = 98;
		marks[2]= 78;
		marks[3] = 85;
		marks[4] = 65;
		marks[5] = 55;
		
		System.out.println("mark of pon"+marks[0]);
		System.out.println("mark of girly"+marks[6]); // not mention any marks so its shows zero
		
		// how to decalre array in one line
		
		float height [] = {9.6f , 6.7f, 9.8f , 0.7f, }; // it created 4 memory space from index 0 - 3
		
		
		System.out.println("height of second persion"+height[1]);
		
		
		

	}

}
