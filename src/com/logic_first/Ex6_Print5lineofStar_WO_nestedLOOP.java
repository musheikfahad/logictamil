package com.logic_first;

public class Ex6_Print5lineofStar_WO_nestedLOOP {

	public static void main(String[] args) {
		
		// 1st method
		
		/*String output = "*,**,***,****,*****";
		for ( String row: output.split(",")) {
			
			System.out.println(row);
			
			
			}*/
		
		// 2nd method
		
		
	/*	String output = "*\n**\n***\n****\n*****\n";
		
		for (int i = 0; i != output.length(); i++) {
			
			System.out.print(output.charAt(i));
			
		}*/
		
		//3rd meth
		
		String output = "123";
		for (int i = 0; i < output.length(); i++) {
			
			int p = output.charAt(i)-'0';
			
			
			System.out.println("*****************".substring(0, p));
			
		}
		
		
	}
		
}
