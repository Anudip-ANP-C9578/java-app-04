package org.anudip;

//importing the TwoNonDecimalNumbersMultiplication
import org.anudip.javaapp04.operation.TwoNonDecimalNumbersMultiplication;

public class App {
    public static void main(String[] args) {
		//creating a constructor
        TwoNonDecimalNumbersMultiplication twoNonDecimalNumbersMultiplication = new TwoNonDecimalNumbersMultiplication();

        //Checking for different test cases
        long result1 = twoNonDecimalNumbersMultiplication.multiply(10, 2);
		
		long result2 = twoNonDecimalNumbersMultiplication.multiply(2, 10);
		
		long result3 = twoNonDecimalNumbersMultiplication.multiply(10, -2);
		
		long result4 = twoNonDecimalNumbersMultiplication.multiply(-10, 2);
		
		long result5 = twoNonDecimalNumbersMultiplication.multiply(-10, -2);
		
		long result6 = twoNonDecimalNumbersMultiplication.multiply(10, 0);
		
		long result7 = twoNonDecimalNumbersMultiplication.multiply(0, 2);
		
		long result8 = twoNonDecimalNumbersMultiplication.multiply(0, 0);
		
    }
}