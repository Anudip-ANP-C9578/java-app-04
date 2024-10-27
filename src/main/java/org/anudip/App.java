package org.anudip;

import org.anudip.javaapp04.operation.TwoNonDecimalNumbersMultiplication;

public class App { // class declaration 
	public static void main(String[] args) {// defining a method{
		TwoNonDecimalNumbersMultiplication twoNonDecimalNumbersMultiplication = new TwoNonDecimalNumbersMultiplication();//creating object of the class
		
		//calling a object of class by passing parameters 10 and 2
		long result1 = twoNonDecimalNumbersMultiplication.multiply(10,2);
		System.out.println(result1);
		
		//calling a object of class by passing parameters 2 and 10
		long result2 = twoNonDecimalNumbersMultiplication.multiply(2,10);
		System.out.println(result2);
		
		//calling a object of class by passing parameters 10 and -2
		long result3 = twoNonDecimalNumbersMultiplication.multiply(10,-2);
		System.out.println(result3);
		
		//calling a object of class by passing parameters -10 and 2
		long result4 = twoNonDecimalNumbersMultiplication.multiply(-10,2);
		System.out.println(result4);
        
		//calling a object of class by passing parameters -10 and -2
        long result5 = twoNonDecimalNumbersMultiplication.multiply(-10,-2);
		System.out.println(result5);
		
		//calling a object of class by passing parameters 10 and 0
		long result6 = twoNonDecimalNumbersMultiplication.multiply(10,0);
		System.out.println(result6);
		
		//calling a object of class by passing parameters 0 and 2
		long result7 = twoNonDecimalNumbersMultiplication.multiply(0,2);
		System.out.println(result7);
		
		//calling a object of class by passing parameters 0 and 0
		long result8 = twoNonDecimalNumbersMultiplication.multiply(0,0);
		System.out.println(result8);
	}
}