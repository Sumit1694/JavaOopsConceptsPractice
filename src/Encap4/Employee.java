package Encap4;

public class Employee {

	private int employee_id;
	private String employee_name;
	private double employee_salary;
	
	public void setEmployeeId(int employee_id)
	{
		this.employee_id=employee_id;
	}
	
	public int getEmployeeId()
	{
		return employee_id;
	}
	
	public void setEmployeeName(String employee_name)
	{
		this.employee_name=employee_name;
	}
	
	public String getEmployeeName()
	{
		return employee_name;
	}
	
	public void setEmployeeSalary(double employee_salary)
	{
		this.employee_salary=employee_salary;
	}
	
	public double getEmployeeSalary()
	{
		return employee_salary;
	}
	
}
