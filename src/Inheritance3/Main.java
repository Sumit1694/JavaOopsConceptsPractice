package Inheritance3;

public class Main {

	public static void main(String[] args) {
		
		Employee emp=new Employee(40000);
		
		HRManager mgr=new HRManager(70000);
		
		emp.work();
		System.out.println(emp.getSalary());
		
		mgr.work();
		System.out.println(mgr.getSalary());
		
	}
	
}
