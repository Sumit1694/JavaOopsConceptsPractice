package OOPS3;

public class FullTimeEmployee extends Employee{

	private double salary;
	
	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary=salary;
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Salary: " + salary);
		System.out.println("Type: Full-Time Employee");
	}

	
	
}
