package ATM;
import java.util.ArrayList;

public class Account {
	
	private String name;
	private String accountNumber;
	private User holder;
	private ArrayList<Transaction>transactions;
	
	public Account(String name,User holder,Bank theBank) {
		this.name = name;
		this.holder = holder;
		this.accountNumber = theBank.getNewAccountID();
		this.transactions = new ArrayList<Transaction>();
		
		
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getSummaryLine() {
		
		double balance = this.getBalance();
		if(balance >= 0) {
			return String.format("%s -> %s :$%.02f ",this.accountNumber,this.name,balance);
		}else {
			return String.format("%s -> %s :$%.02f",this.accountNumber,this.name,balance);
		}
		
	}
	
	
	public double getBalance() {
		
		double balance = 0;
		for(Transaction t : this.transactions) {
			balance += t.getAmount();
		}
		return balance;
	}
	////////////////////////////////////////////////////////////////////
	
	public void printTransHistory() {
		System.out.printf("\n Transaction History for Account %s : ",this.accountNumber);
		for(int t = this.transactions.size()-1;t>=0 ; t--) {
			System.out.printf(this.transactions.get(t).getSummaryLine());
		}
		
		System.out.println();
	}
	
	///////////////////////////////////////////////////////////////
	
	public void addTransaction(double amount ,String memo) {
		
		Transaction transaction = new Transaction(amount,this);
			this.transactions.add(transaction);
		
	}


}
