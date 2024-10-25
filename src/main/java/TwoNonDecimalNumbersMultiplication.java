//creating a package
package org.anudip.javaapp04.operation;
// creating a class 
public class TwoNonDecimalNumbersMultiplication{
	// method to perfom multiplication task
	public long multiply(int num1, int num2){
		int result = 0;
		/*checking the condition if the numbers are
		equals to,greater than or lesser than zero*/
		if(num1 < 0 || num2 < 0){
	      result = -1;
	    }else if((num1 == 0) || (num2 == 0)){
		  result = -2;
	    }else {	
          result = num1 * num2;		
	    }
		//returning the result
		return result;
	}

}