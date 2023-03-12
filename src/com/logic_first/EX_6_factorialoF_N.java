package com.logic_first;

import java.util.Scanner;

public class EX_6_factorialoF_N {

	public static void main(String[] args) {
		int i;
		int fact=1;
		int n =5;
		
		/*Scanner input = new Scanner(System.in);
		System.out.println("enter the value of n??");
		
		n= input.nextInt();*/
		
		
		for (i = 1; i <= n; i++) {
			
			fact= fact*i;
			
		

		}
		System.out.println(fact);

	}

}
