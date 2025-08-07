package Polimorphism4;

public class CheckingAccount extends BankAccount {

	private double overdraftFee;
	
	public CheckingAccount(double initialBalance, double overdraftFee)
	{
		super(initialBalance);
		this.overdraftFee=overdraftFee;
	}
	
	public void withdraw(double amount)
	{
		if(amount<=getBalance())
		{
			super.withdraw(amount);
		}
		else
		{
			System.out.println("Overdraft fees applied");
		}
		
		super.withdraw(amount+overdraftFee);
	}
	
}
