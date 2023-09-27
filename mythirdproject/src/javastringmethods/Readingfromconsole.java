package javastringmethods;

import java.util.Scanner;

public class Readingfromconsole {
	public static void main(String[]args) {
Scanner input= new Scanner(System.in);
  System.out.print("Enter the three words:");
  String s1 = input.next();
  String s2 = input.next();
  String s3 = input.next();
  System.out.println(("s1 is " +""+ s1));
  System.out.println("s2 is"+""+  s2);
  System.out.println("s3 is " +""+  s3);
  
   System.out.print(" Enter a character");
   String s = input.next();
   char ch = s.charAt(3);
   System.out.println("The character entered is" +"  "+   ch);
  
}
}