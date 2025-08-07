package Polimorphism3;

public class Main {

	public static void main(String[] args) {
		
		Sports sports = new Sports();
		Football foot = new Football();
		Basketball basket = new Basketball();
		Rugby rugby = new Rugby();
		
		sports.play();
		foot.play();
		basket.play();
		rugby.play();
		
	}
}
