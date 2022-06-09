package Q1;

public class Account {
	
	
	private double balance;
	private String accountNumber;

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public double withdraw(double amount) throws InsufficientFundsException{
		if(amount<this.balance) {
		return this.balance-amount;
		}
		else {
			InsufficientFundsException ife = new InsufficientFundsException("not enough cash");
			throw ife;
		}
	}
}
