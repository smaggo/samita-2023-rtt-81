package javastringmethods;

import java.util.Arrays;

public class DeleteElements {

	public static void main(String[] args) {
	//	int[] numbers = { 0, 1, 2, 3, 4, 5 };

		int[] numbers;
		System.out.println("original =" + Arrays.toString(numbers));
		int positionToDelete = 1;
		for (int pos = positionToDelete; pos < numbers.length - 1; pos++) {
			numbers[pos] = numbers[pos + 1];
		}
		System.out.println("after move =" + Arrays.toString(numbers));

		// make a new array that is one smaller than the original
		int[] target = new int[numbers.length - 1];
		for (int pos = 0; pos < target.length; pos++) {

			target[pos] = numbers[pos];

		}
		System.out.println("after copy=" + Arrays.toString(target));
	}


		
		  
		    double[] x = new double[]{1, 2, 3};
		    System.out.println("Value is " + x[1]);
		  
		
}
