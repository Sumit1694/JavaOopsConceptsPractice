package OOPS3;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount("SB-123", "Sumit rane", 25000.0);
		
		System.out.println("On bank account:"+" "+bankAccount.getAccountNumber()+" "+"of owner"+" "+bankAccount.getAccountHolderName()+" "+"Having balance"+" "+bankAccount.getBalance());
		
		
		System.out.println("Depositing money into bank account!");
		
		bankAccount.depositMoneyInAccount(5000);
		System.out.println("After deposit money:" + bankAccount.getBalance());
		
		bankAccount.WithdrawMoneyFromAccount(7000);
		System.out.println("Check balance After withdrawal:" + bankAccount.getBalance());
		
		
		
	}
}
