package OOPSCOncepts;

public class Employee {

	private String name;
	private String job_title;
	private double salary;
	
	public Employee(String name, String job_title, double salary)
	{
		this.name = name;
		this.job_title = job_title;
		this.salary = salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void set_Name(String name)
	{
		this.name = name;
	}
	
	public String getJobTitle()
	{
		return job_title;
	}
	
	public void setJobTitle(String job_title)
	{
		this.job_title = job_title;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	//Method to raise and salary 
	public void raiseSalary(double percentage)
	{
		salary = salary+salary*percentage/100;
	}
	
	public void printEmployeeDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Job Title: " + job_title);
		System.out.println("Salary: " + salary);
	}
	
}
