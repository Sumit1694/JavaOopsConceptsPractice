package AbstractStudy2;

public class Main {

	public static void main(String[] args) {
		
		double r = 4.0;
		Circle circle = new Circle(r);
		
		double ts1 = 3.0, ts2=4.0, ts3=5.0;
		Triangle triangle = new Triangle(ts1 , ts2, ts3);
		
		System.out.println("Radius of the circle: "+ r);
		
		System.out.println(circle.calculateArea());
		System.out.println(circle.calculatePerimeter());
		
		System.out.println("\nSides of triangle are:" + ts1 + ',' + ts2 + ',' + ts3);
		
		System.out.println("Area of the triangle: " + triangle.calculateArea());
		System.out.println("Perimeter of the triangle: "+ triangle.calculatePerimeter());
		
		
	}
	
}
