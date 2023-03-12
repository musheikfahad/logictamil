package com.logic_first;

import java.util.Scanner;

//find the next perfect square
public class Break7 {
	//fn to find next perfect square
	
	/*public static int  nextPerfectSquare( int n) {
		int nextN = (int) Math.floor(Math.sqrt(n)) +1;
		return nextN*nextN;
		

	}*/

	public static void main(String[] args) {
		
		System.out.println("enter the number you want to find?");
		Scanner inp = new Scanner(System.in);
	int  n = inp.nextInt();
	int nextN = (int) Math.floor(Math.sqrt(n)) +1;
	nextN= nextN*nextN;
	System.out.println(nextN);
			 
		
	 

		 
	}

}
