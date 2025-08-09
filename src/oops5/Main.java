package oops5;

public class Main {
   
	public static void main(String[] args) {
		
		Payment[] payments = new Payment[2];
		
		payments[0] = new CreditCardPayment();
		payments[1] = new PaypalPayment();
		
		double [] amounts = {150, 75.5};
		
		for(int i=0;i<payments.length; i++)
		{
			payments[i].pay(amounts[i]);
		}
		
		
	}

}
