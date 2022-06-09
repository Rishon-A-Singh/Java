package Q1;

public class AccountDemo {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.deposit(100);
		try {
		System.out.println(a1.withdraw(539));
		}
		catch(InsufficientFundsException ife) {
			System.out.println(ife);
			System.out.println("I can't afford this");
		}
	}
}
