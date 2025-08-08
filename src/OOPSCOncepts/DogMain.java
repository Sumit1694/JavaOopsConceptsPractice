package OOPSCOncepts;

public class DogMain {

	public static void main(String[] args) {
		
		Dog dog1=new Dog("Buddy", "Golden Retriever");
		Dog dog2=new Dog("Charlie", "Building");
		
		System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
		System.out.println(dog2.getName() + " is a " + dog2.getBreed()+ " ");
		
		System.out.println("\n Set the new Breed of dog1 and new Name of dog2:");
		
		dog1.setBreed("Labrodar Retriever");
		dog2.setName("Daisy");
		
		System.out.println(dog1.getName() + "is now a" + dog1.getBreed() + ".");
		System.out.println(dog2.getName() + "is now a" + dog2.getBreed() + ".");
	}
	
}
