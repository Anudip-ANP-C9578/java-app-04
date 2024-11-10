package org.anudip;

 import org.anudip.javaapp04.operation.TwoNonDecimalNumbersMultiplication;

  public class App {
	 public static void main(String[] args) {
		

        TwoNonDecimalNumbersMultiplication multiplication = new TwoNonDecimalNumbersMultiplication();

        // Test cases
        System.out.println(multiplication.multiply(10, 2));  // Expected: 20
        System.out.println(multiplication.multiply(10, -2)); // Expected: -1
        System.out.println(multiplication.multiply(-10, 2)); // Expected: -1
        System.out.println(multiplication.multiply(-10, -2)); // Expected: -1
        System.out.println(multiplication.multiply(10, 0));  // Expected: -2
        System.out.println(multiplication.multiply(0, 2));   // Expected: -2
        System.out.println(multiplication.multiply(0, 0));   // Expected: -2
    }
}

	
