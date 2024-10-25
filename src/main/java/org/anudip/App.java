package org.anudip;
// importing the package.
import org.anudip.javaapp04.operation.TwoNonDecimalNumbersMultiplication;
// creating a class named App to test the expected outputs.
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersMultiplication twoNonDecimalNumbersMultiplication = new TwoNonDecimalNumbersMultiplication();
		/* checking the expected outputs
		   and printing the values */
		long result1 = twoNonDecimalNumbersMultiplication.multiply(10,2);
		System.out.println(result1);
		
		long result2 = twoNonDecimalNumbersMultiplication.multiply(10,-2);
		System.out.println(result2);
		
		long result3 = twoNonDecimalNumbersMultiplication.multiply(-10,2);
		System.out.println(result3);
		
		long result4 = twoNonDecimalNumbersMultiplication.multiply(-10,2);
		System.out.println(result4);
		
		long result5 = twoNonDecimalNumbersMultiplication.multiply(-10,-2);
		System.out.println(result5);
		
		long result6 = twoNonDecimalNumbersMultiplication.multiply(10,0);
		System.out.println(result6);
		
		long result7 = twoNonDecimalNumbersMultiplication.multiply(0,2);
		System.out.println(result7);
		
		long result8 = twoNonDecimalNumbersMultiplication.multiply(0,0);
		System.out.println(result8);
		
		
		
		
	}
}