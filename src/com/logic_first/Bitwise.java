package com.logic_first;

public class Bitwise {

	public static void main(String[] args) {
		
		int a =9,b=12;
		int c = a&b;// and
		 System.out.println("a&b is :"+c);
		 
		 c = a|b; //or
		 System.out.println("a|b is :"+c);
		 
		 c=~a; //not
		 System.out.println("~a is:"+c);
		 
		 c=a^b; // exor
		 System.out.println("a^b is :"+c);
		 
		 
		 //<< left shift
		 // >> right shift
		 // >>> right shift with zero fill
		 
		 int x =4;
		System.out.println(  x<< 1); //  left shift one time if 2 then shift two time, we loose msb and 0added at lsb
		System.out.println(  x<< 2);// this nothing but bit multiplication always on right remembre fromdigital
		// one left shift = x*2
		
		System.out.println(  x<< 28);
		
		System.out.println(  x<< 30);// bcoz 1 went out side msb
		
		
		// even we give byte it promoted into int and give the same answer as above, if we still want want then we have to type caste it
		
		
		byte y =4;
		
		System.out.println( "y is"+( y<< 1)); 
		System.out.println(  y<< 2);
		System.out.println(  y<< 28);
		System.out.println(  y<< 30);
		
		// typecast to reatin in byte
		
		byte z = 4;
		System.out.println("z is:"+ (byte) ( z<< 1));
		System.out.println((byte) ( z<< 2));
		System.out.println( (byte) ( z<< 28));
		System.out.println( (byte) (z<< 30));
		
		// a>>1  right shift notghing but divide by 2
		// msb get empty and its again filled by the previous occupaid number bcoz that previous occupaid number tells about the sign
		// and we loos the msb
		
		// byt a>>>1 fill the msb with a zero irrespect of msb  and same as right shift
		
		int v= -5;
		System.out.println(  "right shift "+(v>>1));
		System.out.println(  "right shift with zero "+(v>>>1));
		
		 int d= 3;
		 d&=1;
		 System.out.println("print d:"+d);
		 
		 // we can use bitwise operator as a boolean operators
		 
		 boolean t = true, q=false;// 1-true,0-false
		 
		 System.out.println( "result of and is:"+(t&q));
		 System.out.println("result of exor is:"+(t^q));
		 System.out.println("result of OR is:"+(t|q));
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 

	}

}
