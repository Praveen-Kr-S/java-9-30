package Learn_Loops;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		
		/*        1
		 * Variable set-up 
		 * 				2
		 * while (condition) {
		 * 					3
    			// Code block to be executed repeatedly
    			      4
    			// increment/decrement
			}
			
			
			// Types of while loop
			/// 1. inc while
			/// 2. dec while
			/// 3. infinite while 
			/// 
		 */
		
//		1.inc while
//		
//		int i = 1;
//		while(i<=5) {
//			System.out.println(i);
//			i++;
//		}
	
		System.out.println("-------------------");
		
//		1.dec while
		
//		i = 5;
//		while(i>=1) {
//			System.out.println(i);
//			i--;
//		}		
		
		
		System.out.println("-------------------");
		
//		2.infinite while
		
		//1
//		i = 5;
//		while(true) {
//			System.out.println(i);
//			i--;
//		}	
		
		//2
//				i = 5;
//				while(i>=1) {
//					System.out.println(i);
//					i++;
//				}
		
	
		
		//do-while loop
		
//		i = 5;
//		do {
//			System.out.println(i);
//			i+=5;
//		}while(i<=50);
		
		
//		Jumping Statement
		//break,continue
//		break
//		int i = 1;
//		while(i<=10) {
//			if(i==6) {
//				break;
//			}
//			System.out.println(i);
//			i++;
//		}
		
//		continue
		
//		int i = 1;
//		for(i = 1; i <= 10; i++) {
//			if(i==6 || i==8) {
//				continue;
//			}
//				System.out.println(i);
//		}
		
		
		
		
//		loop-tasks
//		Fibonacci series -> 0,1  +1+2+3+5
		
//		int n1 = 0;
//		int n2 = 1;
//		for(int i = 1;i <= 5;i++) {
//			int n3 = n1+n2;
//			System.out.println(n3);
//			n1=n2;
//			n2=n3;
//		}
		
		
//		palindrome using integer
		
//		121 - 121	
		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter a value : ");
//		int a = scan.nextInt();
//		int b = 0;
//		int t = a;
//		while(t>0) {
//			int d = t%10;
//			b = 10*b+d;
//			t=t/10;
//		}
//		
//		if(b == a){System.out.println(b+" Palindrome..");}
//		else {System.out.println(b+" Not a Palindrome..");}
		
		/*
		 * t = 121
		 * 1.121>0
		 * d = 121%10 = 1
		 * b = 0*10+1 b = 1
		 * t = 121/10 =>12
		 * 
		 * t = 12
		 * 2.12>0
		 * d = 12%10 = 2
		 * b = 1*10+2 b = 12
		 * t = 12/10 =>1
		 * 
		 * t = 1
		 * 3. 1>0
		 * d = 1%10 = 1
		 * b = 12*10+1 b = 121
		 * t = 1/10 =>0
		 * 
		 * t = 0
		 * 4. 0>0 ->false
		 */
		
		
		
		
//		armstrong number
		
//		153 -> 1^3 + 5^3 + 3^3 => 153
		
		System.out.print("Enter a value : ");
		int a = scan.nextInt();
		int b = 0;
		int t = a;
		
		while(t>0) {
			int d = t%10;//get the last number of digit
			b += Math.pow(d, 4); //152+1 => 153
			t=t/10;//remove the last number of digit
		}
		
		if(b == a){System.out.println(b+" Armstrong..");}
		else {System.out.println(b+" Not a Armstrong..");}		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		

	}

}
