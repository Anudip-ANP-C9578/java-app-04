/*
*creating a package
*/
package org.anudip;

/* 
*importing package and class
*/
import org.anudip.javaapp04.operation.TwoNonDecimalNumbersMultiplication;

public class App {
	public static void main(String[] args) {
		
	/*
    *creating object
    */	 
	TwoNonDecimalNumbersMultiplication twoNonDecimalNumbersMultiplication = new TwoNonDecimalNumbersMultiplication();
	
	System.out.println(twoNonDecimalNumbersMultiplication.multiply(10,2)); //output:20
	
	System.out.println(twoNonDecimalNumbersMultiplication.multiply(10,-2)); //output:-1
	
	System.out.println(twoNonDecimalNumbersMultiplication.multiply(-10,2)); //output:-1
	
	System.out.println(twoNonDecimalNumbersMultiplication.multiply(-10,-2)); //output:-1
	
	System.out.println(twoNonDecimalNumbersMultiplication.multiply(10,0)); //output:-2
	
	System.out.println(twoNonDecimalNumbersMultiplication.multiply(0,2)); //output:-2
	
	System.out.println(twoNonDecimalNumbersMultiplication.multiply(0,0)); //output:-2
	}
}