package Polimorphism4;

public class SavingAccount extends BankAccount {

	private double withdrwalLimit;
	
	public SavingAccount(double initialBalance, double withdrwalLimit) {
		super(initialBalance);
		this.withdrwalLimit=withdrwalLimit;
	}
	
	public void withdraw(double amount)
	{
		if(amount<=withdrwalLimit)
		{
			super.withdraw(amount);
		}
		else
		{
			System.out.println("Withdrawal limit exceeded");
		}
	}

	
	
}
