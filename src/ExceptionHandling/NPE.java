package ExceptionHandling;

public class NPE {
//Runtime exception occurs only
	public static void main(String[] args) {
		
		String str = "ankitSD";
		try
		{
		System.out.println(str.toLowerCase());
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
		
	}
	
}
