package Inheritance4;

public class MainBankAccount {

	public static void main(String[] args) {
		
		System.out.println("Create a Bank account object (A/C no. BA1234) with initial balance of $500");
		
		BankAccount BA1234=new BankAccount("BA123", 500);
		
		System.out.println("Deposit $1000 into BA1234.");
		BA1234.deposit(1000);
		
		System.out.println("New balance after depositing $1000: $" + BA1234.getBalance());
		
		System.out.println("Withdraw $600 from account BA1234");
		BA1234.withdraw(600);
		
		System.out.println("New Balance after withdrawing $600: $" + BA1234.getBalance());
		
		SavingsAccount SA1234=new SavingsAccount("SA1234", 450);
		SA1234.withdraw(300);
		
		System.out.println("Balance after trying to withdraw $300: $" + SA1234.getBalance());
		
		SavingsAccount SA1000=new SavingsAccount("SA1000", 300);
		System.out.println("Try to withdraw $250 from SA1000!");
		SA1000.withdraw(250);
		System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());
		
		
	}
}
