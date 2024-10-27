package org.anudip.javaapp04.operation;//package name 

public class TwoNonDecimalNumbersMultiplication {// class declaration{
	public long multiply(int num1, int num2) {//method defining with return type long
		int result = 0;// initially var result contain value 0
		
		if(num1 <0 || num2 < 0) // return -1 if a negative number is passed to any parameter
		{
			result = -1;
	    }
		else if ((num1 == 0) || (num2 == 0))// return -2 if 0 value is passed to any parameter
		{
		    result = -2;
		}
		else // if above condition is false then controls come here and perform multiplication operation
		{
			result = num1 * num2 ;
		}
		return result; 
    }

}