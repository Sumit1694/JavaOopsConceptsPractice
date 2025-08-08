package Encap6;

import java.util.ArrayList;
import java.util.List;

public class Students {

	private int student_id;
	private String student_name;
	private List grade;
	
	public void setStudentId(int student_id)
	{
		this.student_id=student_id;
	}
	
	public int getStudentId()
	{
		return student_id;
	}
	
	public void setStudentName(String student_name)
	{
		this.student_name=student_name;
	}
	
	public String getStudentName()
	{
		return student_name;
	}
	
	public List getGrade()
	{
		return grade;
	}
	
	public void addGrade(double grade)
	{
		if(this.grade == null)
		{
			this.grade = new ArrayList<>();
		}
		
		this.grade.add(grade);
	}
}
