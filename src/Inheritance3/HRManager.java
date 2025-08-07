package Inheritance3;

public class HRManager extends Employee {

	public HRManager(int salary)
	{
		super(salary);
	}
	
	public void work()
	{
		System.out.println("\nManaging Employees!");
	}
	
	public void addEmployee()
	{
		System.out.println("\n Adding employee!");
	}
	
}
