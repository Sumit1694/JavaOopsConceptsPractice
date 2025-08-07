package Polimorphism4;

public class BankAccount {

	private double balance;
	
	public BankAccount(double initialBalance)
	{
		this.balance=initialBalance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
	    balance = balance + amount;	
	}
	
	public void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Insufficient balance:");
		}
	}
	
}
