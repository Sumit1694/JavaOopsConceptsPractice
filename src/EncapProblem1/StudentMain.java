package EncapProblem1;

public class StudentMain {
	public static void main(String[] args) {

      Student student = new Student();
      student.setName("Sumit Rane");
      student.setRollNumber(101);
      student.setMarks(85.5);
      student.setMarks(120);
      
      System.out.println("Student Name: " + student.getName());
      System.out.println("Student RollNumber: " + student.getrollNumber());
      System.out.println("Student Marks: " + student.getMarks());
		
	}
}
