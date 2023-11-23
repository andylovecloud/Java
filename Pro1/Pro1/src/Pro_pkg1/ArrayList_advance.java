package Pro_pkg1;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_advance {

	public static void main(String[] args) {
	
		        ArrayList<String> shoppingList = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);

		        int i = 1;
//		        int totalItem = 0;
		        while (true) 
		        {
		            System.out.print("Add item " + i + " (type q to quit): ");
		            String item = scanner.nextLine();

		            if (item.equals("q")) 
		            {
		                break;
		            }
		            else 
		            {
		                shoppingList.add(item);
		                i += 1;
//		                totalItem += 1;
		            }
		        }

		        System.out.println("\nShopping Cart:");
		        int totalitems = shoppingList.size();
				for(int j = 0; j < shoppingList.size();j++)
				{
			        for (String item : shoppingList) 
			        {
			        	System.out.println("Item " + (j+1) + ": " + item);
			        	j++;
			        }
				}
				System.out.println("Items total: " + totalitems);
				
				System.out.println("Type the number of item you want to delete from the list");
				int deleteitem = scanner.nextInt();
				 shoppingList.remove(deleteitem-1);
				
//				shoppingList.remove(Integer.valueOf(deleteitem)); 
				
				  int newtotalitems = shoppingList.size();
				 for(int j = 0; j < shoppingList.size();j++)
					{
				        for (String item : shoppingList) 
				        {
				        	System.out.println("Item " + (j+1) + ": " + item);
				        	j++;
				        }
					}
					System.out.println("Items total: " + newtotalitems);
					
	}
}
