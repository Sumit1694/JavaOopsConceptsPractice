package OopsMethodOverloadingAndOverriding;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		AdvancedCalculator advcalc = new AdvancedCalculator();
		
		System.out.println("Add two integers: " + calc.add(5, 3));
		System.out.println("Add two doubles: " + calc.add(2.5, 3.7));
		System.out.println("Add three integers (advanced Calculator): " + advcalc.add(1, 2,3));
		
		System.out.println("Multiply (Calculator):" + calc.multiply(4, 5));
		System.out.println("Multiply (AdvancedCalculator: " + advcalc.multiply(4, 5));
		
	}
	
}
