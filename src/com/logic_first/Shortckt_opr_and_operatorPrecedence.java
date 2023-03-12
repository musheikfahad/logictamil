package com.logic_first;

public class Shortckt_opr_and_operatorPrecedence {

	public static void main(String[] args) {
		
		// short ckt logical operators 
		// && and ||
		// in and gate if first input false then it dont check for sceond input directly give answer without checking second input, if first input true then only it check for second input
		// in or gate if first input true then its dont check for second input, directly gives answer, if first input false then only it checks for second input status,,
		
		//we can also use & and | but its takes more time
		
		int a= 12;
		System.out.println((a>20) && (a<30));
		
		System.out.println((a>20) & (a<30));
		
		System.out.println((a<20)  || (a>30));
		
		System.out.println((a<20)  | (a>30));
		
		
		// operator precedence
		//like bodmos rule
		
		int x = 10, y=25;
		
		double z = x*y-10 / x;
		
		System.out.println("the c is="+z);
		
		// here post fix has high priority
		
		
		

	}

}
