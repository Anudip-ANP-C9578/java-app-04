package org.anudip.javaapp04.operation;

public class TwoNonDecimalNumbersMultiplication {
    
    public long multiply(int num1, int num2) {
        // Check for negative numbers
        if (num1 < 0 || num2 < 0) {
            return -1;
        }
        
        // Check for zero values
        else if (num1 == 0 || num2 == 0) {
            return -2;
        }
        
        // Perform multiplication and return the result
        else {
	long sum = num1 * num2;
        return sum;
	}
     }
}
