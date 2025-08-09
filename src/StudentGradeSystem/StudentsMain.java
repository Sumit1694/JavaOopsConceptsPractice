package StudentGradeSystem;

public class StudentsMain {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setStudentID("S123");
		student.setStudentName("Sumit rane");
		student.setMarks(85);
		
		System.out.println("Student ID: " + student.getStudentId());
		System.out.println("Student Name: " + student.getStudentName());
		System.out.println("Student Marks: " + student.getMarks());
		System.out.println("Grade: " + student.getGrade());
		
		student.setMarks(110);
		
		
		
	}
}
