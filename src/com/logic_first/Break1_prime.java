package com.logic_first;

import java.util.Scanner;

public class Break1_prime {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n ;
		int i=2;
		//boolean flag =false;
		boolean flag = true;
		
		
		System.out.println("Enter the value of n?");
		
		 n = input.nextInt();
		
		while (i<=n/2) {   // we can simply put <  n but it makes slower
			
			if ( n%i==0) {
				System.out.println("not prime");
				//flag=true;
				flag = false;
				break;
				
		}
			i++; // we can use ++i also
			
			
		}
		/*if (!flag) 
			System.out.println(n+"  :prime number");
		else System.out.println(n+" : not a prime number");
			*/
		if (flag== true) {
			System.out.println("prime");
		}
	
	}

}
