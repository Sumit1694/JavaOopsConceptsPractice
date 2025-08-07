
public class Student {

	private int studentid;
	private String studentName;
	private String grade;
	
	public Student()
	{
		this(0, "unknown", "None");
	}
	
	public Student(int studentid, String studentName, String grade)
	{
		this.studentid=studentid;
		this.grade=grade;
		this.studentName=studentName;
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
	    System.out.println(s1.studentid);
	    System.out.println(s1.studentName);
	    System.out.println(s1.grade);
	    
	    Student s2=new Student(101, "Cullen", "A");
	    System.out.println(s2.studentName);
	    System.out.println(s2.studentid);
	    System.out.println(s2.grade);
	}

	
	
}
