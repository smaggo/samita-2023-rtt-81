package variables;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Conditionalvariables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(" Input weight in kilograms ");

		double weight = sc.nextDouble();

		System.out.print("\n Input your height in meters :");

		double height = sc.nextDouble();

		double BMI = weight / (height * height);
		if (BMI < 18.5)
			;

		System.out.println(" Under weight");

		if (BMI >= 18.5 && BMI < 25)
			System.out.println(" Normal");

		else if (BMI >= 25 && BMI < 30)
			;

		System.out.println(" Overweight");

		System.out.println(" obese");
		DecimalFormat df = new DecimalFormat("##.00");

		System.out.print("\n The Body Mass Index (BMI) is" + df.format(BMI) + "kg/m2");

	}
}