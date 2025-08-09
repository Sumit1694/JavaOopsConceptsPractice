package InterfaceDemo13;

public class PaymentsMain {

	public static void main(String[] args) {
		
		Payment creditcard = new CreditCardPayment();
		Payment debitCard = new DebitCardPayment();
		Payment UPIcard = new UPIPayment();
		
		creditcard.pay(3000.23);
		debitCard.pay(124.23);
		UPIcard.pay(324.43);
	}
	
}
