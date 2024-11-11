package org.anudip.javaapp04.operation;//package name 

public class TwoNonDecimalNumbersMultiplication {// class declaration{
	public long multiply(int num1, int num2) {//method defining{
		long result = 0;// initially var result contain value 0
		
		if(num1 <0 || num2 < 0) // if input numbers are negative then output is -1
		{
			result = -1;
	    }
		else if ((num1 == 0) || (num2 == 0))// if either num1 or num2 is zero then output is -2
		{
		    result = -2;
		}
		else // if above condition is false then controls come here and perform multiplicaation operation
		{
			result = num1 * num2 ;
		}
		return result; 
    }

}