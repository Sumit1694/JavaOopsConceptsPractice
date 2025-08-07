package Polimorphism1;

public class Employee {

	public String name;
	public String role;
	
	public Employee(String name,String role)
	{
		this.name=name;
		this.role=role;	
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getRole()
	{
		return role;
	}
	
	public double calculateSalary()
	{
		return 0.0;	
	}
	
}
