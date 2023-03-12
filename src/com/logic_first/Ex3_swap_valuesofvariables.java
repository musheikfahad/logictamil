package com.logic_first;

public class Ex3_swap_valuesofvariables {

	public static void main(String[] args) {
		int a = 1, b=2;
		
		a = a^b;
		b = a^b;
		a=a^b;
		//a=b;
		//b=a;
		
		
		
		
		System.out.println("value of a is ="+a);
		System.out.println("value of b  is="+b);
		//System.out.println("value of c  is="+c);

	}

}
