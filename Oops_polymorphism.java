package Learn_java;

// method overriding
// multiple classes with same functions
// inherited the all class

class a{
	void fun1(){
		System.out.println("Hello Pradeepan");
	}
}
class b extends a{
	void fun1(){
			super.fun1();
			System.out.println("Hello Devadharshini");
		}
}

class c extends b{
	
	void fun1(){
			super.fun1();
			System.out.println("Hello Ragul");
		}
}



// abstraction in java

//1.abstract class method
abstract class ebook{
	abstract void book();
}
class vendor extends ebook{

	@Override
	void book() {
		System.out.println("Book : Learn Java");
		System.out.println("Author Name : Pradeepan");
	}
	
}

//2.interface use to abstraction
interface abc{
	void soure();
}

class ven implements abc{

	@Override
	public void soure() {
		System.out.println("Application : Insta");
		System.out.println("Company : ABC");
	}
	
}


//multiple inheritance

interface A{
	void fun1();
}

interface B{
	void fun2();
}

class CC implements A,B{

	@Override
	public void fun2() {
		System.out.println("Hello Java..");
	}

	@Override
	public void fun1() {
		System.out.println("Hello Python");
	}
	
	
	void fun3() {
		System.out.println("Hello Spring");
	}
	
}

// static keyword


class SS{
	static void ff() {
		System.out.println("Hello Java..");
	}
}




public class Oops_polymorphism {
	

	public static void main(String[] args) {
		
//		c obj = new c();
//		obj.fun1();
			
//		vendor v = new vendor();
//		v.book();
//		
//		ven v1 = new ven();
//		v1.soure();
		
//		SS s1 = new SS();
//		s1.ff();
//		SS.ff();
		
		CC obj1 = new CC();
		obj1.fun1();
		obj1.fun2();
		obj1.fun3();
	}

}
