package OOPSCOncepts;

public class MainCircle {

	public static void main(String[] args) {
		
		int r = 5;
		
		Circle circle = new Circle(r);
		
		System.out.println("Radius of the circle is: " + r);
		System.out.println("The area of the circle is: " + circle.getArea());
		System.out.println("The circumference of the circle is: " + circle.getArea());
		
		r=8;
		
		circle.setRadius(r);
		
		System.out.println("Radius of the circle is: " + r);
		System.out.println("The area of the circle is: " + circle.getArea());
		System.out.println("The circumference of the circle is: " + circle.getArea());
		
		
		
	}
	
}
