package exceptions;

import java.util.Scanner;

public class Exceptionexample {

	public static void main(String[] args) {
		
		ExceptionExample ee = new ExceptionsExamples();
		try{
			ee.readNumber();
		}catch (Excepition e) {
			e.printStackTrace();
			
			
		}
		public void readNumber()throws Exception{
		// TODO Auto-generated method stub
  Scanner scanner = new Scanner(System.in);
//  try to make it so the user has to keep trying until they enter anumber
//  hint: use a while loop and a break
		try {
		System.out.println("Please enter a number:");
		int x = scanner.nextInt();
//		this code executes only if no exception occurs
		System.out.println("you entered the number :"+ x);
		
		
		
	}catch(Exception e) {
//		this code execute only if an exception occurs
		System.out.println("The error message is "+ e.getMessage());
		System.out.println("you did not enter a number");
	} finally {
//		 this code execute no matter what
//		most of the time this is used for resource cleanup
//		 finally is optional
		System.out.println("This executes no matter what");

}
}
}