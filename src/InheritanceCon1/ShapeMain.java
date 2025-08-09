package InheritanceCon1;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape circle = new Circle(5.0);
		Shape rectangle = new Rectangle(4.0, 6.0);
		
		System.out.println("Circle Area: " + circle.calculateArea());
		System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
		
		System.out.println("Rectangle area: " + rectangle.calculateArea());
		System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
	}
}
