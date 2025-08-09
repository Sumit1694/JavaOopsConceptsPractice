package AbstractClass3;

public abstract class Employee {

	protected String name;
	protected int id;
	
	public Employee(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public abstract double calculateSalary();
	
	public void display()
	{
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Salary: " + calculateSalary());
		System.out.println("-----------------------");
	}
	
}
