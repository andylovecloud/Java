package src;
import java.util.Scanner;

public class Login2 {

	public static void main(String[] args) 
	{
		// Peer Review Assignment - Login application - Andy
		
		//Get the scanner method from end user input
		Scanner in = new Scanner (System.in);
		System.out.println("Active?");
		String active = in.nextLine();
		
		System.out.println("Score?");
		int score = Integer.parseInt(in.nextLine());
		
//		System.out.println("Business domain name?");
//		String Domain = in.nextLine();

		//Calling below methods to execute
		checkActivityRecommendation(active, score);
//		GenerateUsername(FName, LName);
	}

	//Defind the method generates the username. The username consists of first four (4) characters of the first name and four (4) last characters of the last name. Lastly, the method prints the generated username in lowercase.
	public static void checkActivityRecommendation(String activityLevel, int score)
	{
		String activ = activityLevel.toString();
		int amount = score;
   
//		if ( activ.equals("vigorous"))
//		{
//			if(score >= 75)
//			{
//			System.out.println("You should exercise more!");
//			System.exit(0);
//			}
//			
//		}
//		else if (activ.equals("moderate"))
//		{
//			if(score >= 150)
//			{
//			System.out.println("You exercise enoughaccording to the recommendations!");
//			System.exit(0);
//			}
////		}
//		while ((!activ.equals("moderate") && !activ.equals("vigorous")))
//		{
//			do
//			{
//				System.out.println("");
////				activ = in.nextLine();
//				count++; //count the times user input
//				if (playAgain.equals("Emma"))
//				{
//					System.out.println("Congratulations!");
//					count++;} // Increase this point to count the text Emma as well
//			}while ((!playAgain.equals("stop") && !playAgain.equals("Emma")));
//		}
//		System.out.println("You guessed "+ count + " times.");
		
		
		  
	}
	//Defind method generates an email address based on the first name, last name and domain name. It converts all the characters to lowercase and finally prints the email. The email may include country specific characters like ä or ö.
//	public static void GenerateEmail(String FName, String LName, String Domain)
//	{
//
//		if (FName.equals("") || LName.equals(""))
//		{
//			System.out.println("Error! First and/or last name is missing.");
//			System.exit(0);
//		}
//		else if (Domain =="")
//		{
//			System.out.println("Error! Domain is missing.");
//			System.exit(0);
//		}
//		else
//		{
//			//Print the combination of given FName + LName + domain
//			System.out.println((FName + "." + LName + "@" + Domain).toLowerCase());
//		}
//
//	}

}