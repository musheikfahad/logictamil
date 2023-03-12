package com.logic_first;

import java.util.Scanner;


public class Else_if_ladder_example {

	public static void main(String[] args) {
		
		Scanner musheik = new Scanner(System.in);
		
		System.out.println("Enter your marks");
		int marks = musheik.nextInt()
		;
		if (marks<50  ) {
			System.out.println("your grade is TROLL");
		}
		
		else if (marks >= 50 && marks <= 60) {
			
			System.out.println("your grade is E");
			
			}
		
else if (marks >= 60 && marks <= 70) {
			
			System.out.println("your grade is D");
			
			}
else if (marks >= 70 && marks <= 80) {
	
	System.out.println("your grade is C");
	
	}

else if (marks >= 80 && marks <= 90) {
	
	System.out.println("your grade is B");
	
	}
		
else if (marks >= 90 && marks <= 100) {
	
	System.out.println("your grade is A");
	
	}


	}

}
