package PolyOverloadinOverriding;

public class MainShape {

	public static void main(String[] args) {
		
		Shape [] shapes = {new Circle(), new Rectangle(), new Traingle()};
		
		for(Shape shape:shapes)
		{
			shape.draw();
			shape.draw("red");
			System.out.println();
		}
		
	}
	
}
