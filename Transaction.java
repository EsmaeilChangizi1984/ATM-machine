package ATM;

import java.util.Date;

public class Transaction {
	// Amount of the trannsaction
	private double amount;
	// Date of the transaction
	private Date timeStamp;
	// Memo for the Transaction
	private String memo;
	// Which Account was used for transaction
	private Account accountType;

	public Transaction(double amount, Account inAccount) {
		this.amount = amount;
		this.accountType = inAccount;
		this.memo = "";
		this.timeStamp = new Date();

	}

	public Transaction(double amount, String memo, Account inAccount) {

		this(amount, inAccount);
		this.memo = memo;

	}
	

	public double getAmount() {
		return this.amount;
	}
	
	public String getSummaryLine() {
		if(amount >= 0) {
			return String.format("%s : $%.02f : %s",this.timeStamp.toString(),this.amount,this.memo);
		}else {
			return String.format("%s : $(%.02f) : %s",this.timeStamp.toString(),-this.amount,this.memo);
		}
	}

}
