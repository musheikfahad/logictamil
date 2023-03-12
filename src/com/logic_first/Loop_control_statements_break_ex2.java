package com.logic_first;

import java.util.Scanner;

// find the sum of all input numbers entered

public class Loop_control_statements_break_ex2 {

	public static void main(String[] args) {
	double 	sum =0.0; // when ever we do accumaltion we have to initialize sum = 0
Scanner input = new Scanner(System.in);
		
		System.out.println("enter the number you want to add . Enter a negative number to when you done:\n?");

		while (true) {
			double n = input.nextInt();
			if (n<0.0) {
				
				break;
				
			}
			sum = sum+n; // sum+=n; we can use compound assignment
			
		}
		System.out.println("Sum is ="+sum);

	}

}
