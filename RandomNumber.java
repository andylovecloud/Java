package Pro_pkg1;

import java.util.Random;

public class RandomNumber {
	public static void main (String[] args) 
	{
		Random random = new Random();
		int randomNumber;
		
		randomNumber = random.nextInt(5);
		System.out.println("Random number between 0-4: " + randomNumber);

		randomNumber = random.nextInt(10)+11;

		System.out.println("Random number between 10-20: " + randomNumber);
		
	}

}
