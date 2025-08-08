package Oops4;

public class Main {

	public static void main(String[] args) {
		
		Playable [] instruments = {new Guitar(), new Piano(), new Drums()};
		
		for(Playable instrument:instruments)
		{
			instrument.play();
		}		
	}
}
