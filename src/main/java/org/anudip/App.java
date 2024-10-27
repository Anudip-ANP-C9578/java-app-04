package org.anudip;
	
import org.anudip.javaapp04.operation.TwoNonDecimalNumbersMultiplication;

public class App 
{
	public static void main(String[] args) 
	{
    TwoNonDecimalNumbersMultiplication twoNonDecimalNumbersMultiplication = new TwoNonDecimalNumbersMultiplication();
 
long value1=twoNonDecimalNumbersMultiplication.multiply(10,2);
System.out.println(value1);
	
long value2=twoNonDecimalNumbersMultiplication.multiply(10,-2);
System.out.println(value2);

long value3=twoNonDecimalNumbersMultiplication.multiply(-10,2);
System.out.println(value3);

long value4=twoNonDecimalNumbersMultiplication.multiply(-10,-2);
System.out.println(value4);

long value5=twoNonDecimalNumbersMultiplication.multiply(10,0);
System.out.println(value5);

long value6=twoNonDecimalNumbersMultiplication.multiply(0,2);
System.out.println(value6);

long value7=twoNonDecimalNumbersMultiplication.multiply(0,0);
System.out.println(value7);
		
   }
}