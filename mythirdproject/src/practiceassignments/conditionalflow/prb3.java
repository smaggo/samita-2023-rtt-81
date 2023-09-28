
package conditionalflow;

/*   Write a program that declares 1 integer variable x, and then assigns 15 to it. 
 * Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
 *  “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20”
 *   if x is greater than or equal to 20. Change x to 50 and notice the result.
*/

public class prb3 {
	public static void main(String[] args) {

		// int x= 7;
		// changing integer to 15
		int x = 15;

		if (x < 10)
			System.out.println(" Less than 10");

		else if ((10 < x) && (x < 20)) {

			System.out.println(" Number between 10 and 20");
		} else if (x > 15)
			System.out.println(" Greater than 20 ");

	}
}
