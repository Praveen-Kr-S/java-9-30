package java_basics;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("***Mobile Brand***");
		System.out.println("1.Apple\n2.Samsung\n3.Nokia\n4.Realme");
		System.out.print("Choose the Mobile Brand : ");
		int brand_no = scan.nextInt();
		switch(brand_no) {
			case 1:
				System.out.println("Welecome to Apple Store Area..");
				break;
			case 2:
				System.out.println("Welecome to Samsung Store Area..");
				break;
			case 3:
				System.out.println("Welecome to Nokia Store Area..");
				break;
			case 4:
				System.out.println("Welecome to Realme Store Area..");
				break;
			default:
				System.out.println("Give the correct value (1-4)..");
		}
		
		
		

	}

}
