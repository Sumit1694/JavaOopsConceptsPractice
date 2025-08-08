package OopsConcepts2;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student1 = new Student("Carolus Vitali", 11);
		Student student2 = new Student("markos thivan", 10);
		Student student3 = new Student("carlos kirlshf", 23);
		
		System.out.println("Students details: ");
		
		student1.printStudentDetails();
		student2.printStudentDetails();
		student3.printStudentDetails();
		
		System.out.println("Adding courses for " + student1.getName());
		
		student1.addCourse("Math");
		student1.addCourse("Science");
		student1.addCourse("English");
		
		System.out.println(student1.getName() + "s courses" + student1.getCourses());
		
		System.out.println("\nAdding courses for " + student2.getName());
		student2.addCourse("History");
		student2.addCourse("Geography");
		student2.addCourse("English");
		
		System.out.println(student2.getName() +"s courses: " +student2.getCourses());
		
		System.out.println("\nRemoving 'Science' course for " + student1.getName());
	    
	    // Remove the course "Science" from student1's courses
	    student1.removeCourses("Science");
	    
	    // Print student1's name and their updated list of courses
	    System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
		
	}
	
}
