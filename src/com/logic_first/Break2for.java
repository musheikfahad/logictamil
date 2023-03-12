package com.logic_first;

// prime numbers

import java.util.Scanner;

public class Break2for {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		//int i =2;
		boolean prime = false;
		
		System.out.println("Enter the value of n?");
		n= input.nextInt();
		
		for (int i = 2; i <=Math.sqrt(n); i++) {  // we simply put n/2 but it makes slower  to male it fast i=<n/2
			// we can use Math.sqrt(num)
			
			if (n%i==0) {
				prime = true;
				break;
				
			}
			
		}
		
		if (!prime) 
			System.out.println(n+" is a prime number");
		else System.out.println(n+ " not a prime number");
		

	}

}
