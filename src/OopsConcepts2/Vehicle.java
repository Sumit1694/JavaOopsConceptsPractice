package OopsConcepts2;

public class Vehicle {

	void displaySpeed()
	{
		System.out.println("Speed not specified");
	}
	
	void displaySpeed(double speedkmh)
	{
		System.out.println("Current speed: " + speedkmh + " km/h");
	}
	
	void displaySpeed(double speedMph, boolean isMph)
	{
		if(isMph)
		{
			double speedkmh = speedMph*1.60934;
			System.out.println("Current speed: " + speedkmh + "jm/h (converted from mph)");
		}
		else
		{
			displaySpeed(speedMph);
		}
	}
}
