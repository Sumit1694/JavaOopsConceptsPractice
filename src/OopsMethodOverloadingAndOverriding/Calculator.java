package OopsMethodOverloadingAndOverriding;

public class Calculator {

	int a; int b;
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public double add(double a,double b)
	{
		return a+b;
	}
	
	public int multiply(int a,int b)
	{
		return a*b;
	}
	
}
