package com.logic_first;

import java.util.Scanner;

public class Break8 {
	public static void main(String[] args) {

		System.out.println("enter the number you want to find?");
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		boolean flag = false;
		
		for (int nextN = 1; nextN <=n+1; nextN++) {
			
			
			if (!flag) {
				nextN = (int) Math.floor(Math.sqrt(n)) +1;
				nextN= nextN*nextN;
				System.out.println(nextN);
				break;
			}
			
		}
	}
}
