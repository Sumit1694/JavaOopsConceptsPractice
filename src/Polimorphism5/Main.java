package Polimorphism5;

public class Main {

	public static void main(String[] args) {
		
		double r = 4.0;
		Circle ci=new Circle(r);
		
		double rs1 = 4.0, rs2=6.0;
		double ts1 = 3.0, ts2=4.0, ts3=5.0;
		
		Rectangle rec =new Rectangle(rs1, rs2);
		Triangle triangle = new Triangle(ts1, ts2, ts3);
		
		System.out.println("Radius of the circle: "+r);
		System.out.println("Area of the circle" + ci.getArea());
		System.out.println("Perimeter of the circle" + ci.getPerimeter());
		System.out.println("\nSides of rectangle are:" + rs1 + rs2);
		System.out.println("Area of the perimeter:" + rec.getArea());
		System.out.println("Perimeter of rectangle are:" + rec.getPerimeter());
		System.out.println("\nSides of rectangle are:" + ts1 + ts2 + ts3);
		System.out.println("Area of triangle is:" + triangle.getArea());
		System.out.println("Perimeter of triangle is:" + triangle.getPerimeter());
		
		
		
	}
	
}
