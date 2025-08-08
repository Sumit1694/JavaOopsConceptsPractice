package Encap2;

public class Main {

	public static void main(String[] args) {
		
		BankAccount account=new BankAccount();
		account.setAccountNumber("SB-23443");
		account.setBalance(25000.0);
		
		String accountNumber = account.getAccountNumber();
		double balance = account.getBalance();
		
		System.out.println("Account number:" + accountNumber);
		System.out.println("Balance: " + balance);
		
		
	}
	
}
