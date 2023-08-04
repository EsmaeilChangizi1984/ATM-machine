package MultiThreading_ATM;

public class Account {
	
	private double balance = 6000;
	
	public void withdraw(double amount) {
		balance-=amount;
	}
	
	public double getBalance() {
		return balance;
	}

}
