package abi;

import java.io.File;
import java.io.IOException;

public class Demo_Exception_Handing {
	
	public void create_file() throws IOException {
		File f = new File("C:\\Users\\prave\\Desktop\\Subash.txt");
		f.createNewFile();
	}
	
	
	
	
	public static void Check_age(int a) {
		if(a < 18) {
			throw new IllegalArgumentException("Access Denied");
		}
		else {
			System.out.println("Access Allowed");
		}
	}
	

	public static void main(String[] args) {
		
//		Check_age(10);
//		throw
//		try {
//			Check_age(10);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
//		throws
		Demo_Exception_Handing dd = new Demo_Exception_Handing();
		try {
			dd.create_file();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		/*
		 * try-catch
		 * try{
		 * 		
		 * 		// block of code 
		 * 
		 * }
		 * catch (Exception e){
		 * 		
		 * 		//e
		 * 
		 * }
		 */
		
//		try {
//			int a = 10;
//			int b = 0;
//			System.out.println(a/b);
//		}
//		catch(Exception e){
////			System.out.println(e);
//			System.out.println("Zero by division Error");
//		}
		
		
//		try {
////			String a1 = "Praveen";
////			System.out.println(a1.charAt(5));
//			
//			int ar1[] = {10,20,30,40,50};
//			System.out.println(ar1[7]);
//		}
//		catch(Exception e){
//			System.out.println(e);
//			
//		}
//		finally {
//			System.out.println("Code Excecuted");
//		}
		
		
		
		
		
		

	}

}
