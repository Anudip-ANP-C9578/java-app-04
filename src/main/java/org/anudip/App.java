package org.anudip;

import org.anudip.javaapp04.operation.TwoNonDecimalNumbersMultiplication;


public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersMultiplication twoNonDecimalNumbersMultiplication = new TwoNonDecimalNumbersMultiplication();
		
		long result1 = twoNonDecimalNumbersMultiplication.multiply(10,2);
		System.out.println(result1);
		
		long result2 = twoNonDecimalNumbersMultiplication.multiply(10,-2);
		System.out.println(result2);
		
		long result3 = twoNonDecimalNumbersMultiplication.multiply(-10,2);
		System.out.println(result3);
		
		long result4 = twoNonDecimalNumbersMultiplication.multiply(-10,-2);
		System.out.println(result4);
		
		long result5 = twoNonDecimalNumbersMultiplication.multiply(10,0);
		System.out.println(result5);
		
		long result6 = twoNonDecimalNumbersMultiplication.multiply(0,2);
		System.out.println(result6);
		
		long result7 = twoNonDecimalNumbersMultiplication.multiply(0,0);
		System.out.println(result7);	
	}
}