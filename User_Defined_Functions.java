package Learn_Functions;

import java.util.Scanner;

public class User_Defined_Functions {
	
	//User - defined functions - 4 types
		/*1.without argument without return type function
		 *2.with argument without return type function
		 *
		 *****function define****
		 * public static void function_name(Argument){
		 * 		//block of code
		 * }
		 * 
		 * ****function call****
		 * function_name()
		 */
//	1.without argument without return type function
	public static void fire() {
		System.out.println("Fire Mode is On....");
	}

//	2.with argument without return type function
	public static void add(int a,int b, int c) {
		
		System.out.println(a+b+c);
		
	}
	
//	3.without argument with return type function
	public static String palindrome() {
		int a = 123;
		int b = 0;
		int t = a;
		while(t>0) {
			int d = t%10;
			b = b*10+d;
			t = t/10;
		}
		
		if(a == b) {
//			System.out.println(b+" is palindrome");
			String c= b+" is palindrome";
			return c;
		}
		else {
//			System.out.println(b+" is not a palindrome");
			String c= b+" is not a palindrome";
			return c;
		}	
	}
	
	
	
//	4.with argument with return type function
	
public static int Find_max(int[] b) {
	
	int a[] = b;
	
	int v = a[0];
	
	for(int i = 0; i<a.length;i++){
		if(a[i]>v) {
			v = a[i];
		}
	}
	
	return v;	
}

// Recursive function -> Factorial
	public static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	
	/*
	 * n=5
	 * return 5*fact(4) ->5*
	 * return 4*fact(3) ->5*4* ->20*
	 * return 3*fact(2) ->20*3* ->60*
	 * return 2*fact(1) ->60*2* ->120*
	 * return 1=> 120*1 = 120
	 */
	
	public static void login() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the user name : ");
		String name = scan.next().toLowerCase();
		
		if(name.equals("subash")) {
			System.out.print("Enter the Password : ");
			String pass = scan.next();
			if(pass.equals("subash123")) {
				System.out.print("Login Success👍👍");
			}
			else {
				System.out.println("Invaild Password..");
				login();
			}
		}
		else {
			System.out.println("Invaild Email Id..");
			login();
		}
	}
	

	public static void main(String[] args) {
		
//		fire();
//		System.out.println("Hiii\nhello");
//		fire();
//		fire();
//		fire();
		
//		add(10,30,40);
//		add(50,20,20);
//		add(2,8,2);
		
//		System.out.println(palindrome());
//		String ss = palindrome();
//		System.out.println(ss);
		
//		int b1[]= {23,4,58,2,9,35};
//		int f = Find_max(b1);
//		System.out.println("Max Value of Array :"+f);
		
//		int dd = 5;
//		int v = fact(dd);
//		System.out.println(dd+" Factorial Value : "+v);
		
		login();
			

	}

}
