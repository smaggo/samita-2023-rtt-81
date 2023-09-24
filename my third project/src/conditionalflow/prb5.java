package conditionalflow;

import java.util.Scanner;

/*. Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: <60
Use the Scanner class to accept a number score from the user to determine the letter grade.
 Print out “Score out of range” if the score is less than 0 or greater than 100.
*/

public class prb5 {
	public void main( String[]args) {
		Scanner input =  new Scanner(System.in);
		int score = input.nextInt();
		System.out.println(" write your score ");{
		
		if((score>=90)&&(score<=100)){
		System.out.println(" A");
		
		}else if (( score>=80)&&(score<90)){
			System.out.println("B");
		
		}else if ((score>=70)&&( score<80)){
			System.out.println("C");
				
			
			
			}else if	((score>=60)&&(score<70)){
			System.out.println("D");
			
			}else if (score<60);{
			System.out.println("F");
			}
			input.close();
		}
	}
}
