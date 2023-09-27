package practiceassignments;

import java.text.DecimalFormat;

public class PA1prb8 {
	public static void main(String [] args) {
//		value is price of each product
	 double coffee = 5.99;
	 double cakeslice = 3.99;
	 double latte = 6.99;
	 double subtotal= 0;
	 double Totalamount = 0;
	 
//	 3 item of 1st product
	 subtotal = coffee*3;
	 
//	 4 item of 2nd product
	 subtotal = subtotal + (cakeslice*4);
	 
	 // 2 items of 3rd product
	 subtotal = subtotal + (latte * 2);
	 double salestax = subtotal*.10;
	 
	Totalamount = subtotal + salestax;
	 
	 System.out.println("Total amount = $" + Totalamount );
	
	 
	
	
	 

			 
	 
	 
	 
	 
 }
}