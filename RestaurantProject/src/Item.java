
public class Item {
	
	private String name;
	private String desc;
	private double price;
	
	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public double getPrice() {
		return price;
	}

	
	public Item(String name, String desc, double price)
	{
		this.name  = name;
		this.desc  = desc;
		this.price = price;
	}

}
