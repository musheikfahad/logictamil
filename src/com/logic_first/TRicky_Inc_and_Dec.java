package com.logic_first;

public class TRicky_Inc_and_Dec {

	public static void main(String[] args) {
		
		
	// 1)
		
		int a = 15;
		a = a++ + ++a; // addition of post and pre increment
		System.out.println("the value of a ="+a);
		
	//	2)
		int b = 15;
		b = ++b + ++b; 
		System.out.println("the value of b ="+b);

 // 3)
		int c = 15;
		c = ++c + c++; 
		System.out.println("the value of c ="+c);
		
		
// 4)
		int x=10, y=20;
		
		int z = x++ + y++;
		
		
		System.out.println("the value of z:"+z);
		
		System.out.println("the value of x:"+x);
		System.out.println("the value of y:"+y);
		
		
	// 5)	
		int xx=10,yy=20;
		int zz= ++xx + ++yy;
		System.out.println("the value of zz:"+zz);
		
		System.out.println("the value of xx:"+xx);
		System.out.println("the value of yy:"+yy);
		
		//6)
		
		int aa=10,bb=20;
		int cc= ++aa + bb++;
		System.out.println("the value of cc:"+cc);
		System.out.println("the value of aa:"+aa);
		System.out.println("the value of bb:"+bb);
		
// 7) 
		int q=10,r=20;
		int s=++q + r++; 
		System.out.println("the value of s:"+s);
		System.out.println("the value of q:"+q);
		System.out.println("the value of s:"+s);
		
		
		// 8)
		int saf =0,hay=0;
		int mar = --saf * --hay * --saf *hay   --;
		System.out.println("the the value of mar= "+mar);

		// -1*-1*-2*-1=2
		
		
	// 9)
		int w = 1;
		int ww = w++ + ++w * --w - w--;
		System.out.println("the value of ww:"+ww);
		
		//10)
		/*int u = 11++
				System.out.println(u);
				its an error*/

	//	10) 
		int u =5;
		int n = u&1;
		System.out.println("the value of n:"+n);

		// 11)
		
		int i=5;
		int exor= (i^3) ^i;
		System.out.println("the value of exor:"+(exor));
		// (a^b) ^a =b 
		// (a^b)^a = a
		
		
		//12) swap the values in two variables without using third variables
		// using exor
		// see Ex3
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
