package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Learn_FileHandling {
	
	public static void create_file() throws IOException {
		File f = new File("C:\\Users\\Livewire\\Desktop\\devadharshini.txt");
		f.createNewFile();
		System.out.println("File is created");
		
	}
	
	
	
	
	

	public static void main(String[] args) throws IOException {
//		Create the file
		
//		create_file();
//	Write the file
//		FileWriter w = new FileWriter(new File("C:\\Users\\Livewire\\Desktop\\praveen.txt"));
//		w.write("hi");
//		w.flush();
//		w.close();
//		System.out.println("File Writted..");
		
		
		
//		Scanner sc = new Scanner(new File("C:\\Users\\Livewire\\Desktop\\praveen.txt"));
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());	
//		while(sc.hasNext()) {
//			System.out.println(sc.nextLine());
//		}
//		sc.close();
		
		
		
//		Write the file
//		FileWriter a = new FileWriter(new File("C:\\Users\\Livewire\\Desktop\\praveen.txt"));
//		a.append("\nHello Abinaya");
//		a.flush();
//		a.close();
//		System.out.println("Data Appended..");		
		
		
		File f = new File("C:\\Users\\Livewire\\Desktop\\praveen.txt");
		
		f.delete();
		
		
		
		
		

	}

}
