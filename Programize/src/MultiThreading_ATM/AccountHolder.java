package MultiThreading_ATM;

public class AccountHolder implements Runnable{
	
	private Account account;
	
	AccountHolder(Account account){
		this.account = account;
	}
	
	public void run() {
		for(int i=0 ; i<4 ; i++) {
			makeWithdrawal(2000);
			if(account.getBalance() < 0) {
				System.out.println("Account is overdrawn.");
			}
		}
		
	}
	
	
	private synchronized void makeWithdrawal(double amount) {
		
		if(account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw $"+amount);
			
			try {
				Thread.sleep(3000);
			}catch(InterruptedException ex) {
				
			}
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" completes the withdraw of "+amount);
		}else {
			System.out.println("Not Enough Balance For"+Thread.currentThread().getName()+" To Withdraw "+account.getBalance());
		}
	}
	

}
