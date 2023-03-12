package com.logic_first;

import java.util.Scanner;

public class EX_4_Loops_n_odd_nUMBERS {

	public static void main(String[] args) {
		int j ;
		int n;
		
		Scanner input = new Scanner (System.in);
		System.out.println("enter the value of n??");
		
		n = input.nextInt();
		
	/*	for ( j=1 ; j <= n ; j++) {
			
			if ((j%2) !=0) {
				System.out.println(j);
				
			}*/
		
	/*	j=1;
		while (j<=n) {
			 
			
			if ((j%2) !=0) {
				System.out.println(j);
				j++; 
		}
			
			
		} */
		
		// do while
		j=1;
		do {
			 
			 
			if ((j%2) !=0) {
				System.out.println(j);
				
			}
			j++;
			
			
		} while (j<=n);
		

	}

}
