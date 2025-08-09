package InterfaceProblem12;

public interface Printable {

	void print();
	
	default void printHeader()
	{
		System.out.println("==== Document Header ====");
	}
}
