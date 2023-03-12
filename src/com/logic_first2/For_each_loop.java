package com.logic_first2;

import java.util.Scanner;

public class For_each_loop {

	public static void main(String[] args) {
		String arrayss [] = new String [5];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the elements of array???");
		
		for (int i = 0; i < arrayss.length; i++) 
			arrayss [i] = input.nextLine();
		
		for (int i = 0; i < arrayss.length; i++) 
			
			System.out.println("user inputed name list array ="+arrayss[i]);
		
		System.out.println("\n");
		
		// instead of accessing above method we can use for each loop
		
		// for each loop
		for (String x : arrayss) {
			System.out.println("user input name list array using foreach ="+x);
		}
			
		int a [] = {2,3,4,5,6};
		
		int sum =0;
		for (int z : a) {
			System.out.println("list of z"+z);
		}
		
		
		for (int z : a) {
			sum += z;
		}
		
		System.out.println("Sum of array list is =" + sum);
	}

}
