package EncapProb21;

public class Employee {

	private String employeeId;
	private String employeeName;
	private double salary;
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary<0)
		{
			System.out.println("Error: Salary connot be negative.");
		}
		else
		{
			this.salary=salary;
		}
	}
	
	public void applyRaise(double percentage)
	{
		if(percentage>0)
		{
			this.salary = this.salary + (this.salary*percentage/100);
		}
		else
		{
			System.out.println("Error: Raise percentage must be positive.");
		}
	}
	
	
}
