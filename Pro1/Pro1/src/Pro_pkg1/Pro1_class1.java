package Pro_pkg1;
import java.util.Scanner;  

public class Pro1_class1 {

	public static void main(String[] args) {
	
		String name = "Duy";
		int age = 23;
//		int num1 = 3;
//		int num2 = 4;
		
		

		System.out.println("Hello World");
//		System.out.println("My name is: " + name);
//		System.out.println("My age is:" + age);
//		System.out.println("The sum of num1 + num2: " + sum);
		
		//Get the input by scanner library
		System.out.println("------Additional requirement-------");
		Scanner scanner = new Scanner(System.in);  
			System.out.println("Enter the number 1: ");  
			int num1 = scanner.nextInt();
			
			System.out.println("Enter the number 2: ");  
			int num2 = scanner.nextInt();
			
			System.out.println("Enter the power you want to calculate: ");
			int power = scanner.nextInt();
			
			
			System.out.print("The power of that number is: ");
			System.out.println(Math.pow(num1,power));  // return a^b i.e. 5^2  
			
			// Identify the number is the odd or even number
		
			int sum = num1 + num2;
			System.out.println("The sum of num1 + num2 is: " + sum);  // return a^b i.e. 5^2
        
			if(sum%2==0){
				System.out.println("The sum of two number is the Even number:" + sum);  
			}else {
				System.out.println("The sum of two number is the Odd number!" + sum);
			}
	}

}
