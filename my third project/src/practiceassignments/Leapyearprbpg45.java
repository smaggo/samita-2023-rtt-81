package practiceassignments;

import java.util.Scanner;

public class Leapyearprbpg45 {
	public static void  main(String[] args) {
		int year;
		
		Scanner scan = new Scanner(System.in);
				
		
		System.out.println( " Enter the year");
		
		year = scan.nextInt();
		
		if((year % 4==0)&&(year% 100== 0)||(year%100!=0 && year%4 == 0)) { 
			System.out.println(" This year is leap year");
			
		}else {
		
		System.out.println(" This is not a leap year");
	}
}
}
			
			
		
	
	 
		
			
		
		
		
		
	

	

	



