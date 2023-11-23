
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Square square1 = new Square(12);
		square1.calcArea();
		System.out.println("Area of Square: " + square1.calcArea());
		
		Circle c = new Circle(2);
		System.out.println("Area of Circle: " + c.calcArea());
		
		Triangle t = new Triangle(4,5);
		System.out.println("Area of Triangle: " + t.calcArea());
		
	}

}

abstract class Shape
{
	protected double area ;//visible with all class in the same package
	
	abstract public double calcArea(); //method detail will be defined later.
	
	public void printArea()
	{
		System.out.println(area);
	}
}

class Square extends Shape   //inherit from Shape class
{
	double side;
	
	//constructor
	public Square(double side) 
	{
		this.side = side;
	}
	
	@Override
	public double calcArea()  
	{ 
		area = side * side;
		return area;
	}
}
//Implement Circle and Triangle classes that also inherit Shape class

class Circle extends Shape

{
	double radius;
	
	public Circle (double radius)
	{
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return (radius * radius * Math.PI);
	}
	
}

// Area of Triangle = 1/2 * (base * height)

class Triangle extends Shape
{
	double base;
	double height;

	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return ((base * height)/2);
	}

	

}
