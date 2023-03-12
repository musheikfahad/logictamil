package com.logic_first;

public class Continue3 {

	public static void main(String[] args) {
		//int n =5;
		outer:
		for (int i = 1; i <=5; i++) {
			inner:
			for (int j = 1; j <=5; j++) {
				
				if(i==2 && j ==2 ) 
					continue inner;
				else if (i==2 && j==3) {
					continue inner;
				}
				else if (i==2 && j==4) {
					continue inner;
				}
			
				else if (i==2 && j==5) {
					continue inner;
				}
				else if (i==2 && j==3) {
					continue inner;
				}
				else if (i==3 && j==3) {
					continue inner;
				}
				else if (i==3 && j==4) {
					continue inner;
				}
				else if (i==3 && j==3) {
					continue inner;
				}
				else if (i==4 && j==1) {
					continue inner;
				}
				else if (i==4 && j==2) {
					continue inner;
				}
				else if (i==4 && j==3) {
					continue inner;
				}
				else if (i==4 && j==4) {
					continue inner;
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				System.out.print("* ");
			}
			
			
			System.out.println("\n");
		}

	}

}
