package PolyMix;

public class Cow extends Animal {

	void makeSound()
	{
		System.out.println("******** Cow Moo *******");
	}
	
	void makeSound(int times)
	{
		for(int i=0;i<times;i++)
		{
			System.out.print("Moo ");
		}
		System.out.println();
	}
}
