package EncapProblem1;

public class Student {

	private String name;
	private int rollNumber;
	private double marks;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setRollNumber(int rollNumber)
	{
		this.rollNumber=rollNumber;
	}
	
	public int getrollNumber()
	{
		return rollNumber;
	}
	
	public void setMarks(double marks)
	{
		if(marks>= 0 && marks <=100)
		{
		this.marks=marks;
		}
		else
		{
			System.out.println("Error: Marks must be between 0 and 100.");
		}
	}
	
	public double getMarks()
	{
		return marks;
	}
}
