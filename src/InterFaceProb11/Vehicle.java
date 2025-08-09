package InterFaceProb11;

public interface Vehicle {

	void start();
	
	default void service()
	{
		System.out.println("Vehicle is being serviced");
	}
	
	static void checkBattery()
	{
		System.out.println("Battery status: Good");
	}
	
}
