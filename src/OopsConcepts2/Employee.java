package OopsConcepts2;

import java.time.LocalDate;
import java.time.Period;

//9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.

public class Employee {

	private String name;
	private double salary;
	private LocalDate hireDate;
	
	public Employee(String name, double salary, LocalDate hireDate)
	{
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setHireDate(LocalDate hireDate)
	{
		this.hireDate = hireDate;
	}
	
	public LocalDate gethireDate()
	{
		return hireDate;
	}
	
	public int getYearsOfService()
	{
		return Period.between(hireDate, LocalDate.now()).getYears();
	}
	
	public void printEmployeeDetails()
	{
		System.out.println("\nName: " + name);
		System.out.println("\nSalary: " + salary);
		System.out.println("\nHire Date: " + hireDate);
	}
	
}
