package PolyOverloadinOverriding;

public class Rectangle extends Shape {

	void draw()
	{
		System.out.println("***** Drawing Rectangle shape ******");
	}
	
	void draw(String color)
	{
		System.out.println("Drawing Rectangle shape in:" + color + "Color");
	}
	
}
