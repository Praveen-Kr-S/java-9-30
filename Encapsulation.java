package Oops_demo;

/*	access specifier & access modifier
 * private -> access the data to own class
 * protected -> access the data to own class and child class
 * public -> access the data any where
 */

class bank{
	private String name = null;
	private String ac_no = null;
	private int pin = 0;
	
	public void name_setter(String n) {
		this.name = n;
	}
	
	public String name_getter() {
		return this.name;
	} 
	
	
	public void ac_no_setter(String n) {
		this.ac_no = n;
	}
	
	public String ac_no_getter() {
		return this.ac_no;
	}
	
	
	public void pin_setter(int n) {
		this.pin = n;
	}
	
	public int pin_getter() {
		return this.pin;
	}
}


//final keyword
//class insta{
//	final int phone = 12345;
//
//	void fun1() {
//		System.out.println("Hello Java...");
//	}
//}

//class dd extends insta{
////	phone = 4322;
//	void fun1(){
//		System.out.println("Hello Python");
//	}
//}




public class Encapsulation {
	
	public static void main(String[] args) {
		
		
		
		bank b = new bank();
		
		
//		System.out.println(b.name);
		
//		System.out.println(b.name);
//		System.out.println(b.ac_no);
//		System.out.println(b.pin);
		
//		b.name_setter("Ragul");
//		b.ac_no_setter("9876543219876");
//		b.pin_setter(4534);
//		
//		
//		System.out.println(b.name_getter());
//		System.out.println(b.ac_no_getter());
//		System.out.println(b.pin_getter());
		
		
		

		
		
	}

}
