package Encap1;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("Arthfael viktroia");
		person.setAge(25);
		person.setCountry("Indonesia");
		
		String name = person.getName();
		int age = person.getAge();
		String country = person.getCountry();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("country:" + country);
		
		
	}
}
