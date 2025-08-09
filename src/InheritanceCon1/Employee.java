package InheritanceCon1;

public class Employee {

	protected int id;
	protected String name;
	protected double baseSalary;
	
	public Employee(int id, String name, double baseSalary)
	{
		this.id=id;
		this.name=name;
		this.baseSalary=baseSalary;
	}
	
	public void displayDetails()
	{
		System.out.println("Employee id:" + id);
		System.out.println("Name: " + name);
		System.out.println("Base Salary: " + baseSalary);
	}
	
	public double calculateSalary()
	{
		return baseSalary;
	}
}


