package InheritanceCon1;

public class Developer extends Employee {

	private String programmingLanguage;
	private double skillAllowance = 3000;
	
	public Developer(int id, String name, double baseSalary) {
		super(id, name, baseSalary);
		this.programmingLanguage=programmingLanguage;
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Programming language: " + programmingLanguage);
	    System.out.println("Total salary: " + calculateSalary());
	}
	
	public double calculateSalary()
	{
		return baseSalary+skillAllowance;
	}

	
	
	
}
