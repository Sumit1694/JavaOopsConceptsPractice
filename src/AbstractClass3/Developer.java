package AbstractClass3;

public class Developer extends Employee {

	private double baseSalary;
	private double overtimeHours;
	private double overtimeRate;
	
	public Developer(String name, int id, double baseSalary, double overtimeHours, double overtimeRate) {
		super(name, id);
		this.baseSalary=baseSalary;
		this.overtimeHours=overtimeHours;
		this.overtimeRate=overtimeRate;
	}

	@Override
	public double calculateSalary() {
		return baseSalary+(overtimeHours*overtimeRate);
	}

	
	
}
