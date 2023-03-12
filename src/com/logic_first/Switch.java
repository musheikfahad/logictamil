package com.logic_first;

import java.util.Scanner;

// switch and if else are known as selection statement

public class Switch {

	public static void main(String[] args) {
		int a, b;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter The FirsT Number:");

		a = scan.nextInt();

		System.out.println("Enter The Second Number:");

		b = scan.nextInt();
		char operator;
		System.out.println("Enter the Operator + , - , * , / or % :");
		operator = scan.next().charAt(0);
		
		
		switch(operator) {
		
		case '+':
			System.out.println(a+" + " + b + " = " +(a+b));
			
			break;
		
			
		case '-':
			System.out.println(a+" - " + b + " = " +(a-b));
			
			break;
			
		case '*':
			System.out.println(a+" * " + b + " = " +(a*b));
			
			break;
		case '/':
			System.out.println(a+" / " + b + " = " +(a/b));
			
			break;
		case '%':
			System.out.println(a+" % " + b + " = " +(a%b));	
		
			break;
			
		default:
			System.out.println("wrong input");
		}
System.out.println("success");
	}

}
