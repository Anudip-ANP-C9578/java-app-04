package org.anudip.javaapp04.operation;


public class TwoNonDecimalNumbersMultiplication {

        // this methord is to multiply 2 integer values

    public long multiply(int num1, int num2) {
        // Check for negative numbers
        long result = 0;

        if ((num1 < 0) || (num2 < 0)) {
            result = -1;
        }

        // Check for zero values
        else if (num1 == 0 || num2 == 0) {
            result = -2;
        }

        // Perform multiplication and return the result
        else {
        result = num1 * num2;

        }
        return result;
     }
}
