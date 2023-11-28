
public class CodeRuner3_OOP {

	public static void main(String[] args) {
		
		Door d = new Door();
		d.interact();
		d.interact();
		System.out.println(d.isOn);
//		LightSwitch l = new LightSwitch();
//		l.interact();
	}

}
// Create Interface
/*
interface Interactable
{
	public void interact();
}

class Door implements Interactable
{
	public void interact()
	{
		System.out.println("Door opened");
	}
}

class LightSwitch implements Interactable
{
	public void interact()
	{
		System.out.println(" Lights turned on");
	}
}
*/


/// Create Abstract Class

abstract class Interactable
{
	public boolean isOn = false;
	abstract public boolean interact(); // remember to put the 'abstract' keyword to identify the abstract method
}


class Door extends Interactable
{
	boolean isOn;
	public Door()
	{
		isOn = false;
	}
	
	@Override
	public boolean interact()
	{
		if(isOn == false)
		{
			System.out.println("Door opened");
			isOn = true;
		}
		else if (isOn == true)
		{
			System.out.println("Door closed");
			isOn = false;
		}
		return isOn; // return is required
	}
}

class LightSwitch extends Interactable
{
	boolean isOn;
	public LightSwitch()
	{
		isOn = false;
	}
	
	@Override
	public boolean interact()
	{
		if(isOn == false)
		{
			System.out.println("Lights turned on");
			isOn = true;
		}
		else if (isOn == true)
		{
			System.out.println("Lights turned off");
			isOn = false;
		}
		return isOn;
	}
}


