package PolyMor13;

public class Manager extends Employee {

	private double managerBonus;
	
	public Manager(double baseSalary, double managerBonus) {
		super(baseSalary);
		this.managerBonus=managerBonus;
	}
	
	public double calculateSalary()
	{
		return baseSalary + managerBonus;
	}
	
	public double calculateSalary(int bonusPercentage)
	{
		return baseSalary + managerBonus + (baseSalary * bonusPercentage/100.0);
	}
	
}	
	

	
	

