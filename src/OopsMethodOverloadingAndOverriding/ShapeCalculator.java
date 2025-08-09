package OopsMethodOverloadingAndOverriding;

public class ShapeCalculator {

	public double calculateArea(double radius)
	{
		return Math.PI*radius*radius;
	}
	
	public double calculateArea(double length, double bredth)
	{
		return length * bredth;
	}
	
	public double calculateArea(double base,double height, boolean isTriangle)
	{
		if(isTriangle)
		{
			return 0.5*base*height;
		}
		else
		{
			return base*height;
		}
		
		
	}
}
