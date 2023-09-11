package Pro_pkg1;

import java.util.Scanner;

public class UserInput {

//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("What is your name? ");
//		String name = in.nextLine();
//		
//		System.out.println("How old are you? ");
//		String age = in.nextLine();
//		
//		System.out.println("Your name is " + name + " and you are " + age + " years old.");
//		
//	}

//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("First number? ");
//		int num1 = in.nextInt();
//		
//		System.out.println("Second number? ");
//		int num2 = in.nextInt();
//		
//		int sum = num1 + num2 ;
//		
//		System.out.println("The sum is " + sum + ".");
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("First number? ");
		int num1 = in.nextInt();
		
		System.out.println("Second number? ");
		int num2 = in.nextInt();
		
		int sum = num1 + num2 ;
		
		System.out.println(num1 + " + " + num2 + " = " + sum );
		
	}
	
}

