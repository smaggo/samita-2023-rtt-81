package conditionalflow;

import java.util.Scanner;

/*Write a program that accepts an integer between 1 and 7 from the user.
 *  Use a switch statement to print out the corresponding weekday. 
 *  Print “Out of range” if the number is less than 1 or greater than 7. 
 *  Do not forget to include “break” statements in each of your cases.
 */


public class prb6 {
	public static void main( String[]args) {
		Scanner input= new Scanner(System.in);
		System.out.println(" Enter no. between 1 and 7");
		int activity = input.nextInt();
		switch (activity) {
		case 1:
		System.out.println(" Do 10 pushup ");
		break;
		case 2:
		System.out.println(" Do 10 squats");
		break;
		case 3:
			System.out.println(" Do 10 jumping jacks");
		break;
		case 4:
			System.out.println(" Do 10 jumps");
		case 5:
			System.out.println(" Stand on one leg");
			break;
		case 6:
			System.out.println(" Do planks");
			break;
		case 7:
			System.out.println("Do cycling for 1 hr");
			break;
		default :
			System.out.println(" Have a great day");
			input.close();
			
		
			
		
		
	}

	}
}
