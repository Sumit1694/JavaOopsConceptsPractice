package OOPs6;

public class Calculator {

	public int add(int num1, int num2)
	{
		return num1+num2;
	}
	
	public int add(int num1, int num2, int num3)
	{
		return num1+num2+num3;
	}
	
	public double add(double n1, double n2)
	{
		return n1+n2;
	}
	
	public int add(int [] numbers)
	{
		int sum = 0;
		for(int num : numbers)
		{
			sum=sum+num;
		}
		return sum;
	}
	
	
}
