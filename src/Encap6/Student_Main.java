package Encap6;

import java.util.List;

public class Student_Main {

	public static void main(String[] args) {
		
		Students student = new Students();
		
		student.setStudentId(1);
		student.setStudentName("Nadiadwala singh");
		
		student.addGrade(92.5);
		student.addGrade(89.0);
		student.addGrade(90.3);
		
		int student_id = student.getStudentId();  
		String student_name = student.getStudentName();
		List<Double> grades = student.getGrade();
		
		System.out.println("Student ID:" + student_id);
		System.out.println("student_name:" + student_name);
		System.out.println("grades:" + grades);
		
	}
	
}
