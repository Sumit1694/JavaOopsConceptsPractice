package Oops4;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[2];
		
		shapes[0] = new Circle(5.0);
		shapes[1] = new Rectangle(4.0, 5.0);
		
		for(Shape shape: shapes)
		{
			System.out.println("Shape: " + shape.getClass().getSimpleName());
			System.out.println("Area: " + shape.getArea());
			System.out.println("Perimeter: " + shape.getPerimeter());
			System.out.println("-------------------");
		}
		
	}
	
}
