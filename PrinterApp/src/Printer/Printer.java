package Printer;
import java.text.NumberFormat;
import java.util.Scanner;  
public class Printer {

	public static void main(String[] args) {
		System.out.println("----Printer App----");
		
		//Define the Creator
		Scanner scanner = new Scanner(System.in);  
		String creator = "Andy";
		System.out.println("This app is made by " + creator);

		//Define two numbers
		System.out.println("Enter the number 1: ");  
		double number1 = scanner.nextInt();
		
		System.out.print("Enter the number 2: ");  
		double number2 = scanner.nextInt();
		
		double add = number1 + number2;
		double mul = number1 * number2;
		double sub = number1 - number2;
		double dev = number1/number2;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(4);
		
		System.out.println("The multiplication of number1 and number2 is : " + mul);
		System.out.println("The addition of number1 and number2 is : " + add);
		System.out.println("The substraction of number1 and number2 is : " + sub);
		System.out.println("The devision of number1 and number2 is : " + nf.format(dev));
		
		
	}

}
