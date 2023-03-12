package com.logic_first;

import java.util.Scanner;

// for given n find nearest number div by 10,that is less than or equal to n
// 78-70
//88-80
//99 -90

public class Loop_control_statements_break {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the value of n?");

		int n = input.nextInt();
		
	/*	for (int i = n; i >=0; i--) {
			if (n%10==0) {
				System.out.println(n);
				break;
			}
			n--;
		}*/
		
	while (n>=0) {                // in while loop conditon we can simple give(true)
			if (n%10==0) {
				System.out.println(n);
				break;
			}
			n--;
		}
		
	}

}
