package OOPS3;

public class Employee {

	int id;
	String name;
	
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void displayDetails()
	{
	   System.out.println("ID: " + id);
	   System.out.println("Name: " + name);
	}
}
