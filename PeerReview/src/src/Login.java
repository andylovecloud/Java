package src;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) 
	{
		// Peer Review Assignment - Login application - Andy
		
		//Get the scanner method from end user input
		Scanner in = new Scanner (System.in);
		System.out.println("First name?");
		String FName = in.nextLine();
		
		System.out.println("Last name?");
		String LName = in.nextLine();
		
		System.out.println("Business domain name?");
		String Domain = in.nextLine();

		//Calling below methods to execute
		GenerateEmail(FName, LName, Domain);
		GenerateUsername(FName, LName);
	}

	//Defind the method generates the username. The username consists of first four (4) characters of the first name and four (4) last characters of the last name. Lastly, the method prints the generated username in lowercase.
	public static void GenerateUsername(String FName, String LName)
	{

	        // Get the first four characters of the first name
	        String firstPart = FName.substring(0, 4);

	        // Get the last four characters of the last name
	        String lastPart = LName.substring(LName.length() - 4);

	        // Combine the two parts and convert to lowercase
	       System.out.println((firstPart + lastPart).toLowerCase());
	        
	}
	//Defind method generates an email address based on the first name, last name and domain name. It converts all the characters to lowercase and finally prints the email. The email may include country specific characters like ä or ö.
	public static void GenerateEmail(String FName, String LName, String Domain)
	{

		if (FName == "")
		{
			System.out.println("Error! First and/or last name is missing.");
		}
		else if (LName =="")
		{
			System.out.println("Error! First and/or last name is missing.");
		}
		else
		{
			//Print the combination of given FName + LName + domain
			System.out.println((FName + "." + LName + "@" + Domain).toLowerCase());
		}

	}

}