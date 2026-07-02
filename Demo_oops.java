package Oops_demo;

//Single level inheritance

class Book{
	void fun1() {
		System.out.println("Book Name : Learn Java");
	}
}


class Author extends Book{
	void fun2() {
		System.out.println("Author Name : Subash");
	}
}


// Multi-level inheritance

class battery{
	void fun1() {
		System.out.println("Provide the Power");
	}
}

class telephone extends battery{
	void fun2() {
		System.out.println("Connect the call");
	}
}

class phone extends telephone{
	void fun3() {
		System.out.println("provide the camera,music features");
	}
}

class sm extends phone{
	void fun4() {
		System.out.println("provide the Net Connection");
	}
}



//Hierarchical Inheritance
class Upi{
	void fun1() {
		System.out.println("Provide transaction API");
	}
}

class Gpay extends Upi{
	void fun2() {
		System.out.println("Gpay access the upi api key");
	}
}

class Pytem extends Upi{
	void fun3() {
		System.out.println("pytem access the upi api key");
	}
}


//Compile time polymorphism or method overloading

//we need single class with multiple functions with same name
//pass the diffrent arguments in functions

class cal{
	
	void fun1(int a, int b) {
		System.out.println("Add Value : "+(a+b));
	}
	
	void fun1(int a, int b, int c) {
		System.out.println("Multple Value : "+(a*b*c));
	}
	
	void fun1(String a, String b) {
		System.out.println("Full Name : "+a+" "+b);
	}
	
}







public class Demo_oops {
	public static void main(String[] args) {
//		Author a = new Author();
//		a.fun1();
//		a.fun2();
		
		
//		sm s = new sm();
//		s.fun1();
//		s.fun2();
//		s.fun3();
//		s.fun4();
		
		
//		Gpay g = new Gpay();
//		g.fun2();
//		g.fun1();
//		
//		Pytem pt = new Pytem();
//		pt.fun1();
//		pt.fun3();
		
		
		cal c = new cal();
		c.fun1(20, 10);
		c.fun1(2, 10, 10);
		c.fun1("Praveen","Kumar");
		
	}
	
	
}
