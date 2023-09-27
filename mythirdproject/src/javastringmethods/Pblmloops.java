package javastringmethods;

import java.util.Scanner;

public class Pblmloops {

	public static void main(String[] args) {
////		Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
//		
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.print(" Enter a positive number");
//    int n1 = scanner.nextInt();
//  
//   System.out.print(" Enter a second number");
//   int n2 = scanner.nextInt();
//   while (n1!=n2) {
//	   if (n1>n2)
//	   n1=n1-n2;
//	   else 
//   n2 = n2-n1;
//	}
//	System.out.print(" gcd o the number is equal to" +n2 );
//   
////   Print a Multiplication Table
//	Scanner input = new Scanner (System.in);
//	
	
		
//		write a program for multiplication table
		
//	for(int i=1;i<=12;i++) {
//		System.out.println( "multiple table of "+ i);
//	
//	for(int j=1;j<=10;j++) {
//		
//	int product = i*j;
//		System.out.print( i + "*" +j + "=" + product+ " " );
//	}
//	System.out.println("\n ");
//	}
//	}
//}	
//	Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year. 
//In how many years will the tuition be doubled?

//Year
//Tuition
//0
//$10,000
//1
//tuition = 1.07 * tuition
//…
//tuition = 1.07 * tuition
//…
//tuition = 1.07 * tuition
//…
//…
//?
//$20,000 or more
   
  double currenttutionfee = 10000;
  double targetutionfee = 10000*2;
  double increase = .07;
  int years = 0;
  while ( currenttutionfee < targetutionfee) 
	  currenttutionfee = 1 +increase;years++;
  
  System.out.println( "tution fee get double in  " + years);
	  
  }
		  
	  
  }
  


	
		
	
				
			
		
		
			
				

	   
 
    	
    	 
    			 
     

    
	

//	private static boolean i(int i, boolean b, int j) {
//		// TODO Auto-generated method stub
//		return false;
//	}



