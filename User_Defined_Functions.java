package Learn_Functions;

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
		String ss = palindrome();
		System.out.println(ss);

	}

}
