package com.logic_first;

import java.util.Scanner;

public class Loops_demo {

	public static void main(String[] args) {
		int i =1;
		
		int n;
		
		Scanner input = new Scanner (System.in);
		System.out.println("hoe many stars you wants??");
		
		 n = input.nextInt();
		 
		 
		/* while (i<=n) {
			 System.out.print("*");
			 i++;
			 
			 // here for "0" it prints no star because i=1 so condition failes
			
		}*/
		
		// do while 
		 
		 do {
			 
			 System.out.print("*");
			 i++;
			// here for 0 it gives one star* becaus irrespect of condition it execute once
			 // used in menu creation
		} while(i<=n);
		

		
	}

}
