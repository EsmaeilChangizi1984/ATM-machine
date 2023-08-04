package MultiThreading_ATM;

public class Account_Main {

	public static void main(String[] args) {
		
		Account account = new Account();
		AccountHolder accountHolder = new AccountHolder(account);
		
		Thread T1 = new Thread(accountHolder);
		Thread T2 = new Thread(accountHolder);
		
		T1.setName("Mike");
		T2.setName("Sara");
		
		T1.start();
		T2.start();
		
		

	}

}
