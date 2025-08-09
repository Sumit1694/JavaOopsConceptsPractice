package PolyMix;

public class Animal_Main {

	public static void main(String[] args) {
		
		Animal [] animals = {new Dog(), new Cat(), new Cow()};
		
		for(Animal animal:animals)
		{
			animal.makeSound();
			animal.makeSound(3);
			System.out.println();
		}
		
	}
	
}
