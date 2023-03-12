package com.logic_first;

public class Loop_control_statements_continue_ex2 {

	public static void main(String[] args) {
		outer:
		for (int i = 1; i <=5; i++) {
			inner:
			for (int j = 1; j <=5; j++) {
				if(i==2&& j==2)
					continue inner;
				System.out.print("* ");
			}
			
			System.out.println();
			
		}

	}

}
