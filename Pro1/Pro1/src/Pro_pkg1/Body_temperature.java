package Pro_pkg1;

import java.util.Scanner;

public class Body_temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFeverLimits();
		
		Scanner in = new Scanner (System.in);
		System.out.println("Subject:");
		String subject = in.nextLine();
		
		System.out.println("Temperature:");
		int temp = Integer.parseInt(in.nextLine());
		Boolean flag = false; 
		

//		Boolean flag;
		if (hasFever(subject, temp) == true)
		{
		System.out.println("The subject has fever");
		}
		else
		{
		System.out.println("The subject has no fever");
		}
	}
	
	public static void printFeverLimits ()
	{
		System.out.println("Fever limits");
	
		System.out.println("- human 37");
		System.out.println("- dog 39");
		System.out.println("- horse 38");
	}
	
	public static Boolean hasFever(String subject, int temp)
	{
		Boolean fever = null;
		
		if (subject.equals("human"))
		{
			if(temp > 37)
			{
//				System.out.println("human has fever");
				return fever = true;
				
			}
			else
			{
//				System.out.println("human has no fever");
				return fever = false;
			}
		}
		else if (subject.equals("dog") )
		{
			if(temp > 39)
			{
//				System.out.println("dog has fever");
				return fever = true;
				
			}
			else
			{
//				System.out.println("dog has no fever");
				return fever = false;
			}
		}
		else if (subject.equals("horse") )
		{
			if(temp > 40)
			{
//				System.out.println("horse has fever");
				return fever = true;
				
			}
			else
			{
//				System.out.println("horse has no fever");
				return fever = false;
			}
		}
		return fever;
	}

}
