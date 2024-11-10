package org.anudip.javaapp04.operation;

 public class TwoNonDecimalNumbersMultiplication {

    public long multiply(int num1, int num2) {
        // Return -1 if any of the numbers are negative
        if (num1 < 0 || num2 < 0) {
            return -1;
        }

        // Return -2 if any of the numbers are zero
        if (num1 == 0 || num2 == 0) {
            return -2;
        }

        // Perform the multiplication and return the result as a long
        return (long) num1 * num2;
    }
}
