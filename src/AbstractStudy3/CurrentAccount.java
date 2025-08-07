package AbstractStudy3;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void deposit(double amount) {
		
		setBalance(getBalance() + amount);
		
		System.out.println("Deposit of $" + amount + "Successful. current balance: $" + getBalance());
	}

	@Override
	public void withdraw(double amount) {
		if(getBalance()>= amount)
		{
			setBalance(getBalance() - amount);
			
			System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
		}
		else
		{
			System.out.println("Insufficient fund. Withdrawal failed.");
		}
	}
	
	

}
