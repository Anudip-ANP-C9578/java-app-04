package org.anudip.javaapp04.operation;

public class TwoNonDecimalNumbersMultiplication {
    // This class performs multiplication of two non-decimal numbers.

    public long multiply(int num1, int num2) {
        // This method performs multiplication of two non-decimal numbers.
        long value;

        if (num1 < 0 || num2 < 0) { // Check if either number is less than zero
            value = -1; // Return -1 for negative numbers
        } else if (num1 == 0 || num2 == 0) { // Check if either number is zero
            value = -2; // Return -2 if either number is zero
        } else {
            long result = (long) num1 * num2; // Explicit type casting
            value = result; // Stores result in value
        }

        switch ((int) value) {
            case -1:
                return -1; // Return -1 for negative numbers
            case -2:
                return -2; // Return -2 if either number is zero
            default:
                return value; // Return the multiplication result
        }
    }
}