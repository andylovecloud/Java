
public class DishwasherExample {

	public static void main(String[] args) {

		Dishwasher d1 = new Dishwasher(1,false); // Define the object from Dishwasher class
		d1.turnOnOff();							// calling turnOnOff method
		d1.setProgramme(3);						// Set new parameter for setProgramme method
		System.out.println(d1.getisOn());		// Print out value of isOn status from Getter of isOn attribute
	}

}

class Dishwasher
{
	// 1st attribute of Dishwasher class
	private int programme;
	
	// Getter for programme
	public int getProgramme() {
		return programme;
	}

	// 2nd attribute of Dishwasher class
	private boolean isOn;
	
	 //Getter for isOn
	public boolean getisOn() {
		return isOn;
	}

	// Constructor
	public Dishwasher (int programme, boolean isOn)
	{
		this.programme = programme;
		this.isOn = isOn;
		printData();		//calling method printData after new object define from main class
	}
	
	// Method printData can not be found outside the class
	private void printData()
	{
		System.out.println("Is the dishwasher on: " +  isOn);
		System.out.println("Programme: " + programme);
	}
	
	// Method setProgramme
	public void setProgramme (int programme)
	{
		if (programme == 1)
		{
			System.out.println("normal");
		}
		else if (programme == 2)
		{
			System.out.println("auto");
		}
		else if (programme == 3)
		{
			System.out.println("Intensive");
		}
		this.programme = programme;
	}
	
	// Method turnOnOff
	public void turnOnOff ()
	{
		if (isOn == false)
		{
			isOn = true;
		}
		else if (isOn == true)
		{
			isOn = false;
		}
	}
	
	
}
