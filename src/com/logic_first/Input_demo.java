package com.logic_first;

import java.util.Scanner;

public class Input_demo {

	public static void main(String[] args) {
		// object creation
		// classname objname = new same class name
		
		
	 Scanner scannnn = new Scanner(System.in);  // here system.in is predefines obj. which belongs to input stream
	 
	 
	 System.out.println("what is your name???");
	 
	 String  name =  scannnn.nextLine();
	 
	 System.out.println("hello "+name);
	 
	 
	 
	 System.out.println("whats your age???");
	 
	int age = scannnn.nextInt();
	
	System.out.println("your age is ="+ age);
	
	System.out.println("are you married??");
	boolean married = scannnn.nextBoolean();
	
	
	System.out.println(married);
	 scannnn.nextLine();/// without this line we cant scan upcoming string
	
	
	System.out.println("mail id plz???");
	
	String mail = scannnn.nextLine();
	
	System.out.println("mail id is :"+ mail);
	
	
	 
	
	
	 

	}

}
