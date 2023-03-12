package com.logic_first;
// prime numbers


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Break3 {
	
	

	public static void main(String[] args) {
		
		System.out.println("Enter the limit you want to print?");
		
		Scanner scan = new Scanner(System.in);
		
		
		
		int limit= scan.nextInt();
		
		List<Integer> primeNumbers = new ArrayList <> ();
		
		for (int numbertocheck = 2; numbertocheck <=limit; numbertocheck++) {
			boolean isPrime =true;
			for (int factor	 = 2; factor <=numbertocheck/2; factor++) {
				if (numbertocheck%factor==0) {
					isPrime=false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(numbertocheck); // while adding this line it simulatneously print the number instead od adding into the aary then printing
				primeNumbers.add(numbertocheck);
			}
		}
	/*	System.out.println("prime numers from 1 to" +limit+" are:  ");
		for (int number: primeNumbers) {
			
			System.out.println(number);
		}*/
	}

}
