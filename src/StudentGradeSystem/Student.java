package StudentGradeSystem;

public class Student {

	private String studentId;
	private String studentName;
	private double marks;


	public void setStudentID(String studentId)
	{
		this.studentId=studentId;
	}
	
	public String getStudentId()
	{
		return studentId;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setMarks(double marks)
	{
		if(marks >= 0 && marks <= 100)
		{
			this.marks=marks;
		}
		else
		{
			System.out.println("Error: marks must be between 0 and 100.");
		}
	}
	
	public double getMarks()
	{
		return marks;
	}
	
	public String getGrade()
	{
		if(marks >= 90)
		{
			return "A";
		}
		else if(marks >= 80)
		{
			return "B";
		}
		else if(marks >=70)
		{
			return "C";
		}
		else if(marks >= 60)
		{
			return "D";
		}
		else
		{
			return "F";
		}	
	}
}
