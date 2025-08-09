package OopsConcepts2;

public class Bike extends Vehicle {

	private static final double MAX_SPEED = 120.0;
	
	public void displaySpeed(double speedkmh)
	{
		if(speedkmh > MAX_SPEED)
		{
			System.out.println(MAX_SPEED + " km/hr");
		}
		else
		{
			super.displaySpeed(speedkmh);
		}
	}
	
}
