package Learn_Loops;

public class Demo_for_loops {

	public static void main(String[] args) {
		
		/*
		 * Syntax of for loop
		 * 			1			2		  4
		 * for(variable-setup;condition;inc/dec){
		 * 			3
		 * 		//for loop block
		 * }
		 * 
		 * 1.inc for loop
		 * 2.dec for loop
		 * 3.nested for loop
		 * 
		 */
		
		//inc for loop
		
//		for(int i = 1; i <= 5;i++) {
//			System.out.println(i);
//			System.out.println(Math.pow(i, 2));
//		}
		
		// dec for
		
//		for(int i = 10; i >= 6;i--) {
//			System.out.println(i);
//		}
		
		
//		Nested for
		
		
// square pattern		

for(int i = 1; i<=5;i++) {
	for(int j = 1; j <= 5;j++) {
		System.out.print(i+" ");
	}
	System.out.println();	
}		
		
System.out.println("------------------------");	
		
for(int i = 1; i<=5;i++) {
	for(int j = 1; j <= 5;j++) {
		System.out.print(j+" ");
	}
	System.out.println();	
}					

System.out.println("------------------------");	
//	inc pattern
		
for(int i = 1; i<=5;i++){
	
		for(int j = 1; j <= i;j++) {
			System.out.print("*"+" ");
		}
		System.out.println();
		
}	
		
/*
 * 	i = 1
 * j=1;j<=1-->1	
 * j=2;2<=1 ->false
 * 
 * i=2
 * j=1;j<=2-->1	
 * j=2;2<=2-->1	2 
 * j = 3->false
 * 
 * i=3
 * j=1;1<=3-->1	
 * j=2;2<=3-->1	2 
 * j=3;3<=3-->1	2 3  
 * j=4 ->false
 * 
 * i=4
 * j=1;1<=4-->1	
 * j=2;2<=4-->1	2 
 * j=3;3<=4-->1	2 3
 * j=4;4<=4-->1	2 3 4 
 * j=5 ->false
 * 
 * i=5
 * j=1;1<=5-->1	
 * j=2;2<=5-->1	2 
 * j=3;3<=5-->1	2 3
 * j=4;4<=5-->1	2 3 4 
 * j=5;5<=5-->1	2 3 4 5 
 * j=6 ->false
 * 
 * i = 6 -> false
 */

System.out.println("------------------------");
//dec pattern	
		
for(int i = 1; i<=5;i++) {
	for(int j = 5; j >= i;j--) {
		System.out.print("#"+" ");
	}
	System.out.println();	
}			
		
System.out.println("------------------------");		
//full pyramid

//for(int i = 1;i<=5;i++) {
//	for(int j = 5;j>=i;j--) {
//		System.out.print("_"+" ");
//	}
//	for(int j = 1; j <= i;j++) {
//		System.out.print("*"+" ");
//	}
//	for(int j = 1; j <= i-1;j++) {
//		System.out.print(j+" ");
//	}
//	System.out.println();
//}
		
	

// Demo

for(int i = 1; i<=5;i++) {
	for(int j = 1; j <= 5;j++) {
		System.out.print(i+" ");
	}
	System.out.println();	
}		
		
System.out.println("------------------------");	
		
for(int i = 1; i<=5;i++) {
	for(int j = 1; j <= 5;j++) {
		System.out.print(j+" ");
	}
	System.out.println();	
}
		
System.out.println("------------------------");		
//Hollow Pattern			
for(int i = 1; i<=5;i++) {
	for(int j = 1; j <= 5;j++) {
		if(i==1 || i==5 || j == 1 || j==5) {
			System.out.print("*"+" ");
		}
		else {
			System.out.print(" "+" ");
		}
	}
	System.out.println();	
}		
System.out.println("------------------------");		
// Plus Pattern

for(int i = 1; i<=5;i++) {
	for(int j = 1; j <= 5;j++) {
		if(i==3 ||j == 3) {
			System.out.print("*"+" ");
		}
		else {
			System.out.print(" "+" ");
		}
	}
	System.out.println();	
}
		
System.out.println("------------------------");		
//Plus Pattern

for(int i = 1; i<=5;i++) {
	for(int j = 1; j <= 5;j++) {
		if(i==3 ||j == 3) {
			System.out.print("*"+" ");
		}
		else {
			System.out.print(" "+" ");
		}
	}
	System.out.println();	
}		
		
System.out.println();		
// Cross Pattern
for(int i = 1; i<=5;i++) {
	for(int j = 1; j <= 5;j++) {
		if(i==j || i+j == 6) {
			System.out.print("*"+" ");
		}
		else {
			System.out.print(" "+" ");
		}
	}
	System.out.println();	
}		
		
System.out.println("------------------------");

//factorial
int n = 5;
int f = 1;
for(int i = 1; i<=n;i++) {
	f*=i; //f=f*i
	//f= 1*1
	//f=1*2=2
	//f=2*3=6
	//f=6*4=24
	//f=24*5=120
}
System.out.println("Factorial :"+f);


		

	}

}
