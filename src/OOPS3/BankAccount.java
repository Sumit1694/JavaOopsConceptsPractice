package OOPS3;

public class BankAccount {

	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount(String accountNumber,String accountHolderName, double balance)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void depositMoneyInAccount(double amount)
	{
		this.balance=this.balance+amount;
	}
	
	public void WithdrawMoneyFromAccount(double amount)
	{
		if(balance >=amount)
		{
			this.balance=this.balance-amount; 
		}
		else
		{
			System.out.println("Insufficient fund!");
		}
	}
	
}
