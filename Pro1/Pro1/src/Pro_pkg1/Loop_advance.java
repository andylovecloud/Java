package Pro_pkg1;

////-------------1-------
//import java.util.Scanner;
//
//public class Loop_advance {
//
//	public static void main(String[] args) {
//		/*Create an app. First ask the user, what is the first number and then ask, what is the last number. For example, if the user gave numbers 2 and 4, the app prints:
//			2
//			3
//			4 
//			The output in a console should be precisely:
//			First number?
//			2
//			Last number?
//			8
//			2
//			3
//			4
//			5
//			6
//			7
//			8*/
//		System.out.println("First number?");
//		Scanner in = new Scanner(System.in);
//		int num1 = in.nextInt();
//		
//		System.out.println("Last number?");
//		int num2 = in.nextInt();
//		
//		int j = num2;
//		for (int i = num1; i <=j; i++)
//		{
//			System.out.println(i);
//		}
//	}
//}

//-------------2-------
import java.util.Scanner;

public class Loop_advance {

	public static void main(String[] args) {
		/*Create a guessing game.

First the app asks the user to guess a name. If the guess of the user is correct, print “Congratulation!” and exit the loop. If the answer is incorrect, the app asks again. The user can stop guessing by typing "stop". Lastly, print how many times the user guessed.

Important - the right answer is Emma.

The output in the console should be if the guesses were Olivia, Ava and Emma:

	Guess my name (type stop to exit)
Olivia
Guess my name (type stop to exit)
Ava
Guess my name (type stop to exit)
Emma
Congratulations!
You guessed 3 times.
Tip! At first create the game so that is just asks the question once. After that, try to make the loop structure. Should you use for, while or do-while? */
		
		
		Scanner in = new Scanner(System.in);
		String playAgain;
		
		int count = 0;
		
		System.out.println("Guess my name (type stop to exit)");
		playAgain = in.nextLine();
		while ((!playAgain.equals("stop") && !playAgain.equals("Emma")))
		{
			do
			{
				System.out.println("Guess my name (type stop to exit)");
				playAgain = in.nextLine();
				count++; //count the times user input
				if (playAgain.equals("Emma"))
				{
					System.out.println("Congratulations!");
					count++;} // Increase this point to count the text Emma as well
			}while ((!playAgain.equals("stop") && !playAgain.equals("Emma")));
		}
		System.out.println("You guessed "+ count + " times.");
		
	}
}

