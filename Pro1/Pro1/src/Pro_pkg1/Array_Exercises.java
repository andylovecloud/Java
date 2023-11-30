package Pro_pkg1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Array_Exercises {

	public static void main(String[] args) {
		
		/*Exercise 1
		1. Create 1-dimensional array and assign furnitures as values (like table, chair, shelf…).
		2. Print the whole array to the Console.
		3. Change the app so that only first two elements of the array are printed.
		 This can be done by editing the for loop.
		4. Change the app so that only “Sofa” is printed if it is found from the array.
		 So, go through the whole array and check if the current element is “Sofa”. 
		
		String [] array = {"table","chair","shelf","Sofa","bed"};

		int j = 4; //number of elements in array

		int i = 0; // index of value in array
		for (i = 0; i < j; i++)
		{
			if (array[i] == "Sofa")
			{
			System.out.println("The " + array[i] + " is in the " + i + " place!");
			}
		}*/
		
		//---Quiz 1---//
		
	/*	Create an array that has the following values:

			Green
			Blue
			Yellow

			1. Print the value of the index 1.

			2. Print the whole array using a loop. 

		String [] array = {"Green","Blue","Yellow"};

		System.out.println(array[1]);
		int j = 3; //number of elements in array
		for (int i = 0; i < j; i++)
		{
			System.out.println(array[i]);	
		}
	*/
	
		
//		----Quiz 2----
		
	/*	Create an array and assign the following aphorisms to it:

			Actions speak louder than words.
			A barking dog never bites.
			A penny saved is a penny earned.
			All things come to those who wait.
			Please, copy the these aphorisms to the code. They must be precisely written to pass the tests.

			Ask the user to type number from 1 to 4. If the user types 2, print the second aphorism (A barking...).

			The output in the console should be the following:

			Pick number from 1-4.
			3
			A penny saved is a penny earned. 
		

		String [] array = {"Actions speak louder than words.","A barking dog never bites.","A penny saved is a penny earned.","All things come to those who wait."};
		
		System.out.println("Pick number from 1-4.");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
			System.out.println(array[i-1]);	*/
		
//		---- Quiz 3 ----
		/*Create an array that has the following values
			Green
			Blue
			Yellow
			1. Print the value of the second index.
			2. Print the whole array using a loop. Before the value, print the number of the array slot, like this:
			1. Green
			2. Blue
			3. Yellow*/
//
//		String [] array = {"Green","Blue","Yellow"};
//
//		System.out.println(array[1]);
//		int j = 3; //number of elements in array
//		for (int i = 0; i < j; i++)
//		{
//			System.out.println(i+1 + ". "+ array[i]);	
//		}
//		
			
//			String[] furniture = {"Table", "Sofa", "Shelf", "Painting"};
//			int j = 3;
//			for(int i = 0; i<j;i++)
//			{
//			    if (furniture[i] == "Sofa")
//			    {
//			        System.out.println("Sofa found");
//			    }
//			}
//	----Quiz 5---
			
			/*Create an array that has the following values:
				3
				6
				1
				Sum the values of the array and print the sum.
		
		int[] num = {3,6,1};
		int sum = num[0] + num[1] + num[2];
		        System.out.println(sum);*/
		
//----- Quiz 6----
		//Create an app. Create an array that has values: 16, 18, 5, 3, 10. 
//		 * Find the smallest value and print it. 
//		Make sure you test the app in IDE with different array values. 
//		   
//		int[] array = {16,18,5,3,10};
//		int minvalue = array[0];
//		for(int i = 0; i < array.length;i++)
//		{
//			if (array[i] < minvalue)
//				minvalue = array[i];
//		}
//		System.out.println(minvalue);
//	}
//-- Quiz 7---
//
//			    ArrayList<String> cars = new ArrayList<String>();
//			    cars.add("Kia");
//			    cars.add("Tesla");
//			    cars.add("BMW");
//			    cars.add("Renault");
//	    
//			System.out.println(cars.get(0));
//			System.out.println(cars.get(1));
//			System.out.println(cars.get(2));
//			System.out.println(cars.get(3));
//			
//			System.out.println("MODIFIED LIST");
//			 cars.set(1,"Ford");
//			 cars.set(2,"Audi");
//			 
//			 for (String i : cars) 
//			 {
//			      System.out.println(i);
//			  }
//			
//			System.out.println("SORTED LIST");
//			Collections.sort(cars);
//			 for (String i : cars) 
//			 {
//			      System.out.println(i);
//			  }
//	}
//
	}}