package PolyMor13;

public class Employee {

	protected double baseSalary;
	
	public Employee(double baseSalary)
	{
		this.baseSalary=baseSalary;
	}
	
	public double calculateSalary()
	{
		return baseSalary;
	}
	
	public double calculateSalary(int bonusPercentage)
	{
		return baseSalary + (baseSalary * bonusPercentage/100.0);
	}
	
}
