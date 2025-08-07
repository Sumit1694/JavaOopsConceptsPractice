package AbstractStudy3;

public class SavingsAccount extends BankAccount {

   public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	public void deposit(double amount)
	{
	   setBalance(getBalance() + amount);	
	   System.out.println("Deposit of $" + amount + "successful. Current balance: $" +getBalance());
	}

	
	public void withdraw(double amount) 
	{
	   if(getBalance() >= amount)
	   {
		   setBalance(getBalance() - amount);
		   
		   System.out.println("Withdrawal of $" + amount + "Successful . Current balance: $" + getBalance());
	   }
	   else
	   {
		   System.out.println("Insufficient fund. Withdrawal failed.");
	   }
		
	}

	

}
