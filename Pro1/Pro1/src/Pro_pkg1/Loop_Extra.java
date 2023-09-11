package Pro_pkg1;

import java.util.Scanner;

//----------1 ----
/*
Ask the user to type how big the triangle should be (how many rows). 
Then print the following triangle patterns using for loops 
(here the user answered 5). Output should be like:

How many rows?
5
    *
   ** 
  *** 
 **** 
***** 

Hints 
At first try to print the following pattern (two for loops)
*
**
***
****
*****

You will need three for loops.
 The first for loop counts the rows and 
 the second empty spaces and the third prints the stars. 
In for loops it may be a good idea to use variables like rows, 
spaces and stars instead of typical i. */
public class Loop_Extra {

	public static void main(String[] args) 
	{

//      int row, i, j;
//      Scanner s = new Scanner(System.in);
//      
//      System.out.println("How many rows?");
//      row = s.nextInt();
//      
//	      for(i=0; i<row; i++)
//	      {
//	         for(j=0; j<=i; j++)
//	            System.out.print("* ");
//	         System.out.print("\n");
//	      }
		Scanner s = new Scanner(System.in); 
		System.out.println("How many rows?");
		int numRows = s.nextInt(); // Number of row
		 for (int row = 1; row <= numRows; row++) 
		 	{
	            // Print spaces in every row
	            for (int space = 1; space <= numRows - row; space++) 
	            {
	                System.out.print(" ");
	            }            
	            // Print stars after filled up the space for each row
		        for (int stars = 1; stars <= row; stars++) 
		        {
		                System.out.print("*");
		         } 
	            System.out.println(); // Move to the next line
	        }	   
	}
}
