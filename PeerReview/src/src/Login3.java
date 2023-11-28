package src;
import java.util.Scanner;

public class Login3 {

	public static void main(String[] args) 
	{
		
		//Get the scanner method from end user input
		Scanner in = new Scanner (System.in);
		System.out.println("Activity level of exercise (vigorous/moderate)?");
		String active = in.nextLine();	
			
			System.out.println("Minutes on 1. day?");
			int day1 = Integer.parseInt(in.nextLine());
			
			System.out.println("Minutes on 2. day?");
			int day2 = Integer.parseInt(in.nextLine());

			System.out.println("Minutes on 3. day?");
			int day3 = Integer.parseInt(in.nextLine());

			System.out.println("Minutes on 4. day?");
			int day4 = Integer.parseInt(in.nextLine());
			
			System.out.println("Minutes on 5. day?");
			int day5 = Integer.parseInt(in.nextLine());

			System.out.println("Minutes on 6. day?");
			int day6 = Integer.parseInt(in.nextLine());

			System.out.println("Minutes on 7. day?");
			int day7 = Integer.parseInt(in.nextLine());

			int sum = day1 + day2 + day3 + day4 + day5 + day6 + day7;
			
			System.out.println("How many times you did muscle strengthening and balance activities?");
			int time = in.nextInt();
			checkActivityRecommendation(active, sum, time);
	}
public static void checkActivityRecommendation(String active, int sum, int time)
	{
	if (!active.equals("")|| time > 3 || sum > 0)
	{		}
	else
	{
		if (active.equals("vigorous") || active.equals("moderate"))
		{
			if(sum >= 150 && active.equals("moderate"))
			{
			System.out.println("You did "+ sum +" minutes " +  active + " exercise during week.");
			System.out.println("You exercise enough according to the recommendations!");
			System.exit(0);
			}
			else if(sum >= 75 && active.equals("vigorous"))
			{
				System.out.println("You did "+ sum +" minutes " +  active + " exercise during week.");
				System.out.println("You exercise enough according to the recommendations!");
				System.exit(0);
			}
			else
			{
				System.out.println("You should exercise more!");
				System.exit(0);
			}
		}
	}
	}

}