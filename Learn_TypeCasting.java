package java_basics;

public class Learn_TypeCasting {

	public static void main(String[] args) {
		
//		type casting
		//widening
		
//		byte n = 127;
//		System.out.println("byte :"+n);
//		
//		short s = n;
//		System.out.println("short :"+s);
		
		
		//Narrowing
		
		/*
		short b = 131;
		System.out.println("short :"+b);
		byte b1 = (byte) b;
		System.out.println("byte :"+b1);
		*/
		
		
		//Arithmetic operator
//		+.*,/,-,%
		int n1 = 5;
		int n2 = 2;
//		System.out.println(n1+n2+76+6);
//		System.out.println(n1-n2);
//		System.out.println(n1*n2);
//		System.out.println(n1/n2);//quation
//		System.out.println(n1%n2);//remainder
		
		//find avg of 3 numbers
//		int num1 = 10;
//		int num2 = 30;
//		int num3 = 20;
//		int total = num1+num2+num3;
//		System.out.println("Total : "+total);
//		int avg = total/3;
//		System.out.println("Average : "+avg);
//		System.out.println((num1+num2+num3)/3);
		
		//find area of circle
		//pir^2
//		float pi = 3.14f;
//		int r = 50;
//		
//		System.out.println(pi*(r*r));
//		//Math class
//		double p = Math.pow(5,3);
//		System.out.println(p);
			
		//Assignment operator
//		+=,-=,*=,/=,%=
		//data-type variable += value;\
//		System.out.println("Assignment Operator");
//		int aa = 10;
//		System.out.println(aa);
//		
//		aa+=20; // aa=aa+20;
//		System.out.println(aa);
//		
//		aa-=10;
//		System.out.println(aa);
//		
//		aa*=10;
//		System.out.println(aa);
//		
//		aa/=10;
//		System.out.println(aa);
//		
//		aa%=2;
//		System.out.println(aa);
//		
//		
//		
////		comparison operator
//		
//		 System.out.println("comparison operator");
//		 int a1,b1,c1,d1;
//		 a1 = 10;
//		 b1 = 20;
//		 c1 = 30;
//		 d1 = 20;
//		 System.out.println(a1 == b1);
//		 System.out.println(d1 == b1);
//		 System.out.println(d1 != c1);
//		 System.out.println(a1 < b1);
//		 System.out.println(a1 > b1);
//		 System.out.println(d1 >= b1);
//		 System.out.println(a1 <= b1);
		
		
		// logical operator
//		System.out.println("logical operator");
//		 int a1,b1,c1,d1;
//		 a1 = 10;
//		 b1 = 20;
//		 c1 = 30;
//		 d1 = 20;
//		 
//		 System.out.println(a1 != b1 && c1 > b1 && b1 <= d1);
//		 System.out.println(a1 == b1 && c1 > b1 && b1 <= d1);
//		 System.out.println(a1 != b1 || c1 < b1 || b1 < d1);
//		 // not --> !(condition)
//		 System.out.println(!(a1 == b1 || c1 < b1 || b1 < d1));
//		 
		 
		 /*
		  * bitwise operator
		  * 
		  * decimal to binary
		  * binary to decimal
		  * 
		  * decimal -> 0-9 => 10
		  * binary -> 0,1 => 2
		  * 
		  * bit-method  <<<---
		  *     2^7	 2^6  2^5   2^4	2^3 2^2 2^1	2^0
		  *  	128   64   32   16   8   4   2   1  -> total = 255
		  *  --->>>
		  *  	 0     1    0    1   0   1   1   0 -->86(decimal) ->x
		  * 	 0     1    1    0   0   0   0   1 -->97(decimal) ->y
		  * & -> 0     1    0    0   0   0   0   0  --> 64 decimal
		  * | -> 0     1    1    1   0   1   1   1 --> 119
		  * ^ -> 0     0    1    1   0   1   1   1 --> 57
		  * 
		  */
		
		 System.out.println(86&97);
		 System.out.println(86|97);
		 System.out.println(86^97);
		 
		 //bitwise compliment (~)
		 //-(n+1) demo->15 -> -(15+1) => -16
		 System.out.println(~15);
		 System.out.println(~-15);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


}