//------1------
package Pro_pkg1;

//public class Loop {
//
//	public static void main(String[] args) {
//		/* Create an app that prints numbers from 0 to 4. Use for loop. 
//
//				The output in the console should be:
//				
//				0
//				1
//				2
//				3
//				4
//				*/
//		
//		for (int i = 0 ; i < 5; i++) 
//		{
//			System.out.println(i);
//		}
//	}
//
//}
//-------------------------
//
//public class Loop {
//
//	public static void main(String[] args) {
//		/* Create an app that prints numbers from 10 to 20. Use for loop. 
//
//			The output in the console should be:
//			
//			10
//			11
//			12
//			13
//			14
//			15
//			16
//			17
//			18
//			19
//			20
//				*/
//		
//		for (int i = 10 ; i < 21; i++) 
//		{
//			System.out.println(i);
//		}
//	}
//
//}
//-----------3------

//
//public class Loop {
//
//	public static void main(String[] args) {
////		Create an app that loops through the numbers from 0 to 20 but prints the number only if the number is 5, 16 or 20.
////		The output in the console should be:
////		5
////		16
////		20
//		for (int i = 0 ; i < 21; i++) 
//		{
//			if (i==5|| i==16 || i==20)
//			System.out.println(i);
//		}
//	}
//}
//
////-----------4------
//
//
//public class Loop {
//
//	public static void main(String[] args) {
////		Create an app that prints 5 times loop (use for loop):
////
////			loop
////			loop
////			loop
////			loop
////			loop
//		for (int i = 0 ; i < 5; i++) 
//		{
//			System.out.println("loop");
//		}
//	}
//}


////-----------5------
//
//
//public class Loop {
//
//public static void main(String[] args)
//	{
////	Print numbers from 1 to 5 using Do-While or While loop.
////
////	The output in the console should be:
////
////	1
////	2
////	3
////	4
////	5
//	int i = 1;
//		while (i < 6) 
//		{
//			System.out.println(i);
//			i++;
//		}
//	}
//}
//

//////-----------6------
//
//
//public class Loop {
//
//public static void main(String[] args)
//{
////	Create an app that prints 10 * symbols in a row. In every iteration one * symbol is printed. The final result should look like this: 
////
////		********** 
////		Hint! Use System.out.print instead of System.out.println 
//int i = 0;
//	while (i < 10) 
//	{
//		System.out.print("*");
//		i++;
//	}
//}
//}
////-----------7------

//
//public class Loop {
//
//public static void main(String[] args)
//{
////	Create an app that prints (use for loop):
////
////		Round 1
////		Round 2
////		Round 3
////		Round 4
////		Round 5
////		Round 6
////		Round 7
////		Round 8
////		Round 9
////		Round 10
//int i = 1;
//while (i < 11) 
//{
//	System.out.println("Round " + i);
//	i++;
//}
//}
//}


import java.util.Scanner;
public class Loop {

	public static void main(String[] args) {
		
		System.out.println("Activity level of exercise (vigorous/moderate)?");
		Scanner in = new Scanner(System.in);
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
		System.out.println("You did "+ sum +" minutes " +  active + " exercise during week.");
	
	}
}