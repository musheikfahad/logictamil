package com.logic_first;
 

//print all number less than 100 except number div by 4 and 6
public class Continue2 {

	
	public static void main(String[] args) {
	
		
		for (int i = 1; i <=100; i++) {
			
			if (i%4==0) {
			
					continue;
			}
			else if (i%6==0) {
				continue;
			}
			System.out.println(i);
			
		}
		
		

	}
}
