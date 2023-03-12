package com.logic_first;

import java.util.Scanner;

public class Break4 {

	public static void main(String[] args) {
		//perfect square
		System.out.println("enter the number you want to find?");
		Scanner inp = new Scanner(System.in);
		 int n = inp.nextInt();
	 int i = 1;
	 boolean flag =false;
		 while (i<=n ){
		
			if (i*i==n) {
				
				//System.out.println("Given number is perfect square");
				flag = true;
				break;
			}
			i++;
		}
		 if (flag) {
			 System.out.println("Given number is  A perfect square");
			}
		 else {
			System.out.println(" NOT perfect square");
		}
	}

}
