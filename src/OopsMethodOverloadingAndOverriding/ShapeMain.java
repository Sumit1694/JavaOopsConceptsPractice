package OopsMethodOverloadingAndOverriding;

public class ShapeMain {

    public static void main(String[] args) {
		
    	ShapeCalculator calc = new ShapeCalculator();	
    	
    System.out.println("Area of circle: " + calc.calculateArea(5.0));
    
    System.out.println("Area of rectangle: " + calc.calculateArea(4.5, 3.2));
    
    System.out.println("Area of Triangle: " + calc.calculateArea(6.0,4.0, true));
    
    System.out.println("Area of circle (int input):" + calc.calculateArea(5));
    System.out.println("Area of rectangle (int input): " + calc.calculateArea(4,6));
    	
	}
	
}
