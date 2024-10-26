//Program to perform multiplication of two non-decimal numbers

package org.anudip.javaapp04.operation;

public class TwoNonDecimalNumbersMultiplication     

/*To performs the task multiplication of two non-decimal numbers*/

{
	public long multiply(int var_1, int var_2)  
	
	/*This method performs the task of multiplication of two non-decimal numbers.*/

    {      
		switch(input_check(var_1,var_2))
		{

            // USING SWITCH CASE STATEMENT TO RETURN VALUES

			case 0 : return var_1 * var_2; //multiplication performing

			case -1 : return -1; 

			case -2 : return -2; 

			default : return -1; //fallback 
 		}
	}

	//This method checks input vales

	public int input_check(int var_1,int var_2)	
	{
        // USING WHILE TO CHECK THE INPUT VALUES

		while (var_1 < 0 || var_2 < 0)
		{
			return -1;  //returns -1 for negative input
		}
		while (var_1 == 0 || var_2 == 0)
		{
			return -2;  //returns -2 for input value zero
		}
		return 0;  //returns zero
	}
}