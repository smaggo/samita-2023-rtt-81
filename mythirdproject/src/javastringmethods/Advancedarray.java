package javastringmethods;

import java.util.Arrays;

public class Advancedarray {
 public  static void main(String[] args) {
	 double[] numbers = {6.0,4.4,1.9,2.9,3.4,3.5};
	 
	 String[] strings = { "one","two","three"};
	 
	 String str1 = " abc";
	 str1.toUpperCase();
	 
	 
	 Arrays.sort(strings);
	 System.out.println(Arrays.toString(strings));

	 
	 // find min. and max.value of the array
	 double min = numbers[0];
	 double max = numbers[0];
	 for( double number : numbers) {
		 
		 if(number < min)
			 min=number;
	 }
	 double number = 0;
	if (number > max) {
		 max = number;
		 
	 }
	 
	 System.out.println("min = " + min);
	 System.out.println(" max =" + max);
	 
 }
}
