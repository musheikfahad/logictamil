package com.logic_first;

import java.util.Scanner;

public class Break5 {
// perfect sqaure
	public static void main(String[] args) {
		System.out.println("enter the number you want to find?");
		Scanner inp = new Scanner(System.in);
		 int n = inp.nextInt();
	 
	 boolean flag =false;
	 
	 
	 for (int i = 1; i <=n; i++) {
		if (i*i==n) {
			flag = true;
			break;
		}
	}
	 if (flag) {
		 System.out.println("Given number is  A perfect square");
		}
	 else {
		System.out.println(" NOT perfect square");
	}

}
}
