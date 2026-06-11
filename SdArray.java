package Learn_Array;

import java.util.Scanner;

public class SdArray {

	public static void main(String[] args) {
		
		/*
		 * Single Dimension array syntax
		 * --> Pure Java method..
		 * datatype variable [] = new datatype[array_size];
		 * 
		 */
		
		int ar [] = new int[5];
		//variable[index] = value;
//		ar[0] = 10;
//		ar[1] = 20;
//		ar[2] = 30;
//		ar[3] = 40;
//		ar[4] = 50;
//		System.out.println(ar);
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]);
//		System.out.println(ar[4]);
		
//		for(int i = 0;i<=4;i++) {
//			System.out.println(ar[i]);
//		}
		
		/*
		 * Enhanced for loop
		 * for(datatype variable:array variable){
		 * 		//block of code
		 * }
		 */
		
//		for(int v:ar) {
//			System.out.println(v);
//		}
		
//		c,c++ method
		
		//datatype variable [] = {values};
		
		int a [] = {100,200,300,400,500};
//		for(int i = 0;i<=4;i++) {
//			System.out.println(a[i]);
//		}
		
		//single dimension array values gets from user input
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter the Array Size : ");
//		int size = scan.nextInt();
//		int ar1 [] = new int[size]; 
//		for(int i = 0; i < ar1.length;i++) {
//			System.out.print("Enter the Array "+i+" Index Value :");
//			ar1[i] = scan.nextInt();
//		}
//		
//		for(int i = 0;i< ar1.length;i++) {
//			System.out.println(ar1[i]);
//		}
		
//		Multi-dimensional array
		/*
		 * 2D Array syntax
		 * datatype variable [][] = new datatype[row-size][column-column];
		 * 
		 *variable[row_index][column_index] = value; 
		 */
		
//		int a1 [][] = new int[3][2];
		/*
		 *      0   1 
		 * 0 	10  20 
		 * 1 	30  40 
		 * 2	50  60 
		 */
		
//		a1[0][0] = 10;
//		a1[0][1] = 20;
//		a1[1][0] = 30;
//		a1[1][1] = 40;
//		a1[2][0] = 50;
//		a1[2][1] = 60;
		
//		for(int i = 0; i<3;i++) {
//			for(int j=0; j<2;j++) {
//				System.out.print(a1[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//		for(int a2[]:a1) {
//			for(int v:a2) {
//				System.out.print(v+" ");
//			}
//			System.out.println();
//		}
		
		//Array value get from Scanner Method
		
//		System.out.println("Enter the Array Row Size : ");
//		int row = scan.nextInt();
//		System.out.println("Enter the Array Column Size : ");
//		int column = scan.nextInt();
//		
//		int arr[][] = new int[row][column];
//		
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<column;j++) {
//				System.out.print("Enter Array row :"+i+" col :"+j+" value :");
//				arr[i][j] = scan.nextInt();
//			}
//		}
//		
//		for(int i = 0; i<row;i++) {
//			for(int j=0; j<column;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//		to find max number of array
		int aa[] = {11,32,1,45,23};
		int v = aa[0];
		for(int i = 0;i<aa.length;i++) {
			if(aa[i] > v) {
				v=aa[i];
			}
		}
		
		System.out.println("Max Array Value : "+v);
		
	

	}

}
