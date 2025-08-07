package Inheritance6;

public class Employee extends Person {

	private int employeeId; 
	private String jobTitle;
	
	public Employee(String firstName, String lastName, int employeeId, String jobTitle)
	{
		super(firstName, lastName);
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public String getLastName()
	{
		return super.getLastName() + " , " + jobTitle;
	}
	
}
