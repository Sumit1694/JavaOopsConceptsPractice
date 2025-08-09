package InterfaceDemo13;

public class UPIPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid Rs."+ amount + "using Credit card");
	}

	
	
}
