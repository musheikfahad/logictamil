package com.logic_first;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// get two input from user 
		
		Scanner  arith = new Scanner(System.in);
		
		System.out.println("enter the value of a");
		
		int a = arith.nextInt();
		
		System.out.println("enter the value of b");
		
		int b = arith.nextInt();
		
		int c,d,e,f,g;
		
		c = a+b;
		d= a-b;
		e=a*b;
		f=a/b ;
		g=a%b;
		
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("f="+f);
		System.out.println("g="+g);
		
		
		// compound assingnment
		
		int x=10;
		x+=100;
		System.out.println("the value of x is ="+x);
		
		
		
		// justify the output
		
		int i = 3,j=4,k;
		
		k=i + j + i++ +j++ + ++i + ++j; 
		
		System.out.println("the value of k is="+k);
		
		
		
		

	}

}
