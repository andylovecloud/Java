
public class adminUI {
	
	public static void createMenu()
	{
		// IRL (in real life) data is read from database
		
		Menu menu = new Menu();
		Item i1 = new Item("Burger","Big size",5.4);
		menu.addItem(i1);
		
		Item i2 = new Item("Pizza","Large size",10.5);
		menu.addItem(i2);
		
		menu.printMenu();
	}
}
