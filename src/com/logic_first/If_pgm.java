package com.logic_first;

import java.util.Scanner;

public class If_pgm {

	public static void main(String[] args) {
		
		int Age ;
		String name ;
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("enter your name:");
		
		name =input.nextLine();
		
		System.out.println("enter your age :" );
		
		Age = input.nextInt();
		
		
		if (Age>=18) {
			 // for online code you dont have to use{} inside if
			System.out.println(name+" eligible to vote");
		}
		
		else {
			System.out.println("dear " +name +" you have to grow up");
		}
		
		

	}

}
