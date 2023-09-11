package Pro_pkg1;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_advance {

	public static void main(String[] args) {
	
		        ArrayList<String> shoppingList = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);

		        while (true) 
		        {
		            System.out.print("Add item (x = exit): ");
		            String item = scanner.nextLine();

		            if (item.equals("x")) 
		            {
		                break;
		            }
		            else 
		            {
		                shoppingList.add(item);
		            }
		        }

//		        System.out.println("\nShopping List:");
		        for (String item : shoppingList) 
		        {
		            System.out.println(item);
		        }
		    }
	}
