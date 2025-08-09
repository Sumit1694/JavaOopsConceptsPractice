package PolyOverloadinOverriding;

public class Circle extends Shape {

	void draw()
	{
		System.out.println("***** Drawing circle shape ******");
	}
	
	void draw(String color)
	{
		System.out.println("Drawing circle shape in:" + color + "Color");
	}
	
}
