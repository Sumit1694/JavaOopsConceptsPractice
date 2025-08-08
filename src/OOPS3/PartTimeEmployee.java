package OOPS3;

public class PartTimeEmployee extends Employee {

	private double hourlyRate;
	private int hoursWorked;
	
	public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
		super(id, name);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Hourly Rate:" + hourlyRate);
		System.out.println("Hours Worked:" + hoursWorked);
		System.out.println("Total Pay: " + (hourlyRate*hoursWorked));
		System.out.println("Type: Part-time Employee");
	}

	
	
}
