package myselfpractice;

import java.util.Scanner;

public class Readingfromconsole {

	public static void main(String[] args) {
		System.out.println("Taking input from user");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your no");
		int x = input.nextInt();
		System.out.println(" Enter other no.");
		int y = input.nextInt();
	     System.out.println("Enter your operator from +,-,*,/");
	     int operator = input.next().charAt(1);
		
		switch (operator) {
		
			case '+'
			: 
				System.out.println("Sum = " + (x+y));
				break;
			case '-' :
				System.out.println("subtract = " + (x-y));
				break;
			case '*':
				System.out.println("Multiplication = " + (x*y));
				break;
			case '/' :
				System.out.println("Division = " +(x/y));
				break;
				
			
		}
		

		

	}

}
