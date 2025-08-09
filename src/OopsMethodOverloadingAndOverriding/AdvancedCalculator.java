package OopsMethodOverloadingAndOverriding;

public class AdvancedCalculator extends Calculator {

	public int multiply(int a,int b)
	{
		System.out.println("Advanced multiplication in advancedCalculator");
		return a*b;
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
}
