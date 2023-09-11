package Pro_pkg1;

import java.util.Scanner;

public class Sequence {
	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("This is the Age application!");
	System.out.println("");
	System.out.println("Enter your age: ");
	int age = scanner.nextInt();
	if (age > 0 && age < 18) 
		{

		System.out.println("You are a minor");

		if (age >= 15 && age < 18) {

		System.out.println("You can ride a moped");
		
			if ((age == 16 || age == 17)){
				System.out.println("You can drive a kevari.");	
			}
		}}
	else if ((age == 18)){
		System.out.println("You have just come of age and are allowed to drive a car.");
		}
	else if (age ==58) 
		{
		System.out.println("You can retire early");
		}
	else if (age == 65) 
		{
		System.out.println("Happy retirement");
		}		
	else {
		System.out.println("You are an adult");
		
		if (age > 65 && age < 100)
			{
			System.out.println("You are a pensioner");
			}
		else if (age >= 100)
			{
			System.out.println("Congrastulation!");
			System.out.println("Congrastulation!");
			System.out.println("Congrastulation!");
			}
		} 
	}
}
