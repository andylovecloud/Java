
public class Main {

	public static void main(String[] args) {
		Square s = new Square(12);
		System.out.println("Area of Square: " + s.calcArea()); //similar with s.printArea()
		
		Circle c = new Circle(4);
		System.out.println("Area of Circle: " + c.calcArea()); //similar with c.printArea()

		Triangle t = new Triangle(4,5);
		System.out.println("Area of Circle: " + t.calcArea()); //similar with t.printArea()
	}

}
interface Shape // all methods in Interface are Abstract
{
	public double calcArea();  //no keyword 'abstract' is require here
	public void printArea();
	
}

class Square implements Shape
{
	double side;
	public Square (double side)
	{
		this.side = side;
	}
	
	public double calcArea()
	{
		return side * side;
	}
	
	public void printArea()
	{
		System.out.println(side*side);
	}
	
}

//Implement Circle and Triangle classes that also implement Shape interface

//Circle

class Circle implements Shape
{
	double radius;
	public Circle (double radius)
	{
		this.radius = radius;
	}
	
	public double calcArea()
	{
		return (radius * radius * Math.PI);
	}
	public void printArea()
	{
		System.out.println(radius * radius * Math.PI);
	}

}
//Triangle

class Triangle implements Shape
{
	double base;
	double height;
	public Triangle (double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	
	public double calcArea()
	{
		return ((base * height)/2);
	}
	public void printArea()
	{
		System.out.println(((base * height)/2));
	}

}

