package InterfaceDe112;

public class Duck implements Flyable, Swimmable {

	@Override
	public void swim() {
		System.out.println("Duck is Swimming");
		}

	@Override
	public void fly() {
		System.out.println("Duck is flying");	
	}
}
