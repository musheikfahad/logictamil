package com.logic_first;

import java.util.Scanner;

public class Ifelse_Ladder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Number =");
		
int	number=	input.nextInt();
	
	
	if (number>0) {
		
		System.out.println("the entered number is positive");
	}
	
	else if (number==0) { // we can use many else as we wanted  
		
		System.out.println("the entered number is niether positive nor neagtive and its ZERO");
		
	}
	
	else {
		System.out.println("the entered number is negative");
	}

	}

}
