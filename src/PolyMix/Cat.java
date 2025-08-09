package PolyMix;

public class Cat extends Animal {

	void makeSound()
	{
		System.out.println("******** Cat Meow *******");
	}
	
	void makeSound(int times)
	{
		for(int i=0;i<times;i++)
		{
			System.out.print("Meow ");
		}
		System.out.println();
	}
}
