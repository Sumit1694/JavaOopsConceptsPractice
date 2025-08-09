package PolyMor13;

public class Developer extends Employee {

	private double developerBonus;
	
	public Developer(double baseSalary, double developerBonus) {
		super(baseSalary);
		this.developerBonus=developerBonus;
	}
	
	public double calculateSalary()
	{
		return baseSalary + developerBonus;
	}
	
	public double calculateSalary(int bonusPercentage)
	{
		return baseSalary + developerBonus + (baseSalary * bonusPercentage/100.0);
	}
}
