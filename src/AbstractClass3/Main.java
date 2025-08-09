package AbstractClass3;

public class Main {

	public static void main(String[] args) {
		
		Employee manager = new Manager("Sujit", 102, 25000, 18000);
		Employee developer = new Developer("kalpana", 104,40000,20,50 );
		
		manager.display();
		developer.display();
		
		
	}
	
}
