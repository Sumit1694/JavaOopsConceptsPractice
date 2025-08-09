package EncapProb21;

public class EmployeeMain {

	public static void main(String[] args) {
		
	Employee emp = new Employee();
	emp.setEmployeeId("E123");
	emp.setEmployeeName("Sumit Rane");
	emp.setSalary(50000);
	
	System.out.println("Before raise: " + emp.getSalary());
	emp.applyRaise(10);
	
	System.out.println("After raise: " + emp.getSalary());
  	emp.setSalary(-1999);
 }
}
