package java_basics;

import java.util.Scanner;

public class User_inputs {

	public static void main(String[] args) {
		//Scanner object sytax
		//classname variable = new classnme(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name :");
		//Datatype variable = scannerObjectName.inbuild_functions
		//String Data
//		String user_name = scan.next();
//		System.out.println("User Name : "+user_name);
		String user_name = scan.nextLine();
		System.out.println("User Name : "+user_name);
		
		//int input
		System.out.print("Enter Age : ");
		int age = scan.nextInt();		
		System.out.println("User Age : "+age);
		
//		byte
		System.out.print("Enter Mark : ");
		byte m = scan.nextByte();		
		System.out.println("User Mark : "+m);

		
	}

}
