
public class Initializer {

	static int intialValue;
	
	static
	{
		intialValue = 1000;
		System.out.println("Static block: initalValue intialized to " + intialValue);
	}
	
	public static void main(String[] args) {
		
		System.out.println(Initializer.intialValue);
		
		Initializer i =new Initializer();
		System.out.println("After creating instance: = " + i.intialValue);
	}
	
}
