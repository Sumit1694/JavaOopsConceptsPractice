package PolyOverloadinOverriding;

public class Traingle extends Shape {

	void draw()
	{
		System.out.println("***** Drawing Traingle shape ******");
	}
	
	void draw(String color)
	{
		System.out.println("Drawing Traingle shape in:" + color + "Color");
	}
	
}
