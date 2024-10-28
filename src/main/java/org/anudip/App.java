package org.anudip;

import org.anudip.javaapp04.operation.TwoNonDecimalNumbersMultiplication;

public class App
{
public static void main(String[] args)
{
TwoNonDecimalNumbersMultiplication twonondecimalnumbersmultiplication = new TwoNonDecimalNumbersMultiplication();

long result1 = twonondecimalnumbersmultiplication.multiply(10,2);
System.out.println(result1);

long result2 = twonondecimalnumbersmultiplication.multiply(10,-2);
System.out.println(result2);

long result3 = twonondecimalnumbersmultiplication.multiply(-10,2);
System.out.println(result3);

long result4 = twonondecimalnumbersmultiplication.multiply(-10,-2);
System.out.println(result4);

long result5 = twonondecimalnumbersmultiplication.multiply(10,0);
System.out.println(result5);

long result6 = twonondecimalnumbersmultiplication.multiply(0,2);
System.out.println(result6);

long result7 = twonondecimalnumbersmultiplication.multiply(0,0);
System.out.println(result7);

}
}