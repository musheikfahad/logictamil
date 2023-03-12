package com.logic_first;

import java.util.Scanner;

public class EX5_loops_sumOF_N_natural_numbers {

	public static void main(String[] args) {
		
		int i;
		int n;
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of n??");
		
		n = input.nextInt();
		
		int answer = n;
		for (i = 0; i <= n; i++) {
			
			answer = (n*(n+1)/2);
			
			

		}
		System.out.println(answer);
	}

}
