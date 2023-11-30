import java.util.ArrayList;

public class Menu {

	private ArrayList<Item> items;  // array list link to class Item
//	private double price;
	
	public Menu()
	{
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) //change from String to Item by calling object 'Item' from Item class 
	{
		items.add(item);
	}
	
	public void printMenu()
	{
		for (int i = 0; i <items.size(); i++)
		{
//			System.out.println(items.get(i));  --> If we keep it, this will print the object values,NOT string
			System.out.println(items.get(i).getName()); // Use getter from Item class to get exactly the String 
			System.out.println(items.get(i).getDesc());
			System.out.println(items.get(i).getPrice());
		}
	}
	
}
