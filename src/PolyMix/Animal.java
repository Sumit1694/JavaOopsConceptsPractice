package PolyMix;

public class Animal {

	void makeSound()
	{
		System.out.println("******** Animal makes sound *******");
	}
	
	void makeSound(int times)
	{
		for(int i=0; i<times; i++)
		{
			makeSound();
		}
	}

}
