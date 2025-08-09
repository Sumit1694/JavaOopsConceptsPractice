package InheritanceCon1;

public class Manager extends Employee {

	private String department;
	private double bonus = 5000;
	
	public Manager(int id, String name, double baseSalary)
	{
		super(id, name, baseSalary);
		this.department=department;
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Department: " + department);
		System.out.println("Total salary: " + calculateSalary());
	}
	
	public double calculateSalary()
	{
		return baseSalary + bonus;
	}
	
}
