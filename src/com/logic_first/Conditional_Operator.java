package com.logic_first;

public class Conditional_Operator {

	public static void main(String[] args) {
		// using if and else

		int a = 65, b =987;
		int maxim;

		/*if (a > b)
			maxim = a;

		else
			maxim = b;*/
		//System.out.println(maxim);
		
		
		
		// using conditional operators
		
		maxim = (a>b)? a:b;
		System.out.println(maxim);
	}

}
