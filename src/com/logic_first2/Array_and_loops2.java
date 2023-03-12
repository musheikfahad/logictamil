package com.logic_first2;

import java.util.Scanner;

public class Array_and_loops2 {

	public static void main(String[] args) {
		int [] a = new int [6];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 6 elemets of array?");
		
		for (int i = 0; i < a.length; i++) {
			a [i] = input.nextInt();
		}
			
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("user input is ="+ a[i]);
			
		}
		
		
		

	}

}
