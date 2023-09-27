package variables;

import java.util.Scanner;

public class ScannerExample {
  public static void main (String[] args) {
	  // create an object of Scanner class
	
	  Scanner input = new Scanner(System.in);
	  System.out.println("steps to order a coffee");
	  System.out.println("select the size of cup from S,M,l");
	  System.out.println("size of the cup__ oz");
	  
	  // read input line of text from keyboard
	  String name =input.nextLine();
	  System.out.println("I want\t"+ name+ "oz");
	
	  
	  
	 
	  
  }
}
