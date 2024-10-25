package org.anudip.javaapp04.operation;

public class TwoNonDecimalNumbersMultiplication {

//Method named multiply as per instructions
 public long multiply(int num1, int num2) {
int result = 0;
//-1 as output for Negative numbers
if((num1 < 0) || (num2<0)) {
result = -1;
}
//-2 as output for zero values
else if ((num1 == 0) || (num2==0)) 
{
result = -2;
}
// for postive Numbers
else
{
result = num1 * num2;
}
return result;
}
}