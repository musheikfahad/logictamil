package com.logic_first;

import java.util.Scanner;



public class Break6 {

	public static void main(String[] args) {
		// using Math.sqrt find perfect square
		System.out.println("enter the number you want to find?");
		Scanner input = new Scanner(System.in);
		 double n = input.nextInt();
	 
	 boolean flag =false;
	
		for (double i = 1; i <=n; i++) {
			if (i*i==Math.sqrt(n*n)) {
				
				flag = true;
				break;
				
			}
			
		}
		
		 if (flag) {
			 System.out.println("Given number is  A perfect square");
			}
		 else {
			System.out.println(Math.floor(Math.sqrt(n*n)));
			System.out.println("Not a perfect square");
		}
	
		
		

	}

}
