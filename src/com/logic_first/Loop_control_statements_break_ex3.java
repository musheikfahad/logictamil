package com.logic_first;

public class Loop_control_statements_break_ex3 {

	public static void main(String[] args) {
		int n=5;
		outerloop: // labels
		for (int i = 1; i <=n; i++) {
			innerloop:
			for (int j = 1; j <=n; j++) {
				if (i==3 && j==3) {
					
					//break innerloop;
					//break outerloop; // we can break any loop all we need to di is name ebery loop 
				}
				System.out.print("* ");
			}
			
			System.out.println();
			
		}

	}

}
