package PolyOverloadinOverriding;

public class Shape {

	void draw()
	{
		System.out.println("***** Drawing shape ******");
	}
	
	void draw(String color)
	{
		System.out.println("Drawing shape in:" + color);
	}
	
	
}
