/*
*creating a package
*/
package org.anudip.javaapp04.operation;

/*
*creating a class named TwoNonDecimalNumbersMultiplication
*/
public class TwoNonDecimalNumbersMultiplication {

/*
*creating a method named multiply accessible to any class
*and  this method contains two parameters 
*of int type and returns result of long type 
*/
    public long multiply(int num1, int num2) {
		long result = 0;
		
		/*checking if number is negative and 
		*if negative return -1
		*/
		if (num1 < 0 || num2 < 0) {
			return -1;
		} 
		
		/*checking if number is 0 and 
		*if 0 return -2
		*/
		else if(num1 == 0 || num2 == 0) {
			return -2;
		} 
		
		//performs multiplication if number is neither negative nor 0
		else {
            result = num1 * num2;
        }
        return result;
    }
}	