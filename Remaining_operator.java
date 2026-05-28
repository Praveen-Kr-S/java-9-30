package java_basics;

public class Remaining_operator {

	public static void main(String[] args) {
		
//		unary operator
//		increment 
//		1.-> pre (++variable)
//		2.-> post (variable++)
		
//		int a = 10;
//		System.out.println(++a);//1+a => 11
//		System.out.println(a++);//a+1
//		System.out.println(a);
		
//		decrement 
//		1.-> pre (--variable)
//		2.-> post (variable--)
//		int b = 15;
//		System.out.println(--b);
//		System.out.println(b--);
//		System.out.println(b);
		
		
//		Ternary operator
//		Syntax : 
//		data-type variable = (condition)?true expression:false expression;
//		int c = 10;
//		String value = (c == 0)?"c is zero...":"c is not zero";
//		System.out.println(value);
		
		
//		Conditional Operator
//		if statement
//		1
		int v = 10;
		if(v==0){
			System.out.println("v is zero..");
		}
//		2
		int m = 78;
		int n = 97;
		if(m>n) {
			System.out.println("Quation of m & n : "+(m/n));
			System.out.println("Remainder of m & n : "+(m%n));
		}
		
//		if-else
		
//		4 - odd/even
		int num = 13;
		if(num%2 == 0) {
			System.out.println(num+" is even number");
		}else {
			System.out.println(num+" is odd number");
		}
		
//		5 -  positive or negative
		int num1 = 13;
		if(num1 > 0) {
			System.out.println(num1+" is postive number");
		}else {
			System.out.println(num1+" is negative number");
		}
		
//		6
		
		char c = 'b';
		if(c == 'a' || c=='e'|| c=='i' || c=='o' || c=='u') {
			System.out.println(c+" is vowel sound");
		}
		else {
			System.out.println(c+" is not a vowel sound");
		}
		
		
		//if-else if-else
		
		/*
		 * unit <= 100 --> free
		 * unit > 100   unit<= 200 --> 10
		 * unit > 200   unit<= 400 --> 18
		 * unit > 400 --> 25
		 */
		
		int unit = 0;
		if(unit > 0 && unit <= 100) {
			System.out.println("EB Bill Amount : No Charges..");
		}
		else if(unit > 100 && unit <= 200) {
			System.out.println("EB Bill Amount : "+(unit*10));
		}
		else if(unit > 200 && unit <= 400) {
			System.out.println("EB Bill Amount : "+(unit*18));
		}
		else if(unit > 400) {
			System.out.println("EB Bill Amount : "+(unit*25));
		}
		else {
			System.out.println("Give the proper unit format..");
		}
		
		
		
		// nested if condition
		
		String email = "pk@gmail.com";
		if(email == "pkr@gmail.com") {
			System.out.println("Email Vaild...");
			String pass = "1234";
			if(pass == "123456") {
				System.out.println("Login Success...");
			}
			else {
				System.out.println("Invaild Password...");
			}
			
		}
		else {
			System.out.println("Invaild Email ID......");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
