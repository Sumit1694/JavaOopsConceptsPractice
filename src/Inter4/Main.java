package Inter4;

public class Main {

	public static void main(String[] args) {
		
		Flyable[] flyingObjects = {new SpaceCraft(), new AirPlane(), new Helicopter()};
		
		for(Flyable obj:flyingObjects)
		{
			obj.fly_obj();
		}
		
		
	}
	
}
