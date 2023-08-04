package ATM;

import java.util.ArrayList;
import java.security.*;

public class User {

	private String firstName;
	private String lastName;
	private String userID;
	private byte pinNumber[];
	private ArrayList<Account> accounts;

	public User(String firstName, String lastName, String pin, Bank theBank) {

		this.firstName = firstName;
		this.lastName = lastName;

		try {
			// Giving a String or data and converting it to fixed size output
			MessageDigest md = MessageDigest.getInstance("MD5");
			this.pinNumber = md.digest(pin.getBytes());

		} catch (NoSuchAlgorithmException e) {
			System.err.println("No such Algorithem Exception");
			e.printStackTrace();
			System.exit(1);
		}

		this.userID = theBank.getNewUserID();
		this.accounts = new ArrayList<Account>();

		System.out.printf("New user : %s %s with user Id : %s created .\n", firstName, lastName, this.userID);

	}

	public void addAccount(Account anAcct) {
		this.accounts.add(anAcct);
	}

	public String getUserID() {
		return userID;
	}

	public boolean validatePin(String pinCode) {

		try {
			// Giving a String or data and converting it to fixed size output
			MessageDigest md = MessageDigest.getInstance("MD5");
			return MessageDigest.isEqual(md.digest(pinCode.getBytes()), this.pinNumber);

		} catch (NoSuchAlgorithmException e) {
			System.err.println("No such Algorithem Exception");
			e.printStackTrace();
			System.exit(1);
		}

		return false;

	}

	public String getFirstName() {
		return this.firstName;
	}

	public void printAccountsSummary() {

		System.out.printf("%s accounts summary :\n ", this.firstName);
		for (int i = 0; i < accounts.size(); i++) {

			System.out.printf("%d) %s \n",i + 1, this.accounts.get(i).getSummaryLine());
		}
		System.out.println();
	}

	public int numAccounts() {
		return this.accounts.size();
	}

	public void printAcctTransHistory(int accIndex) {
		this.accounts.get(accIndex).printTransHistory();

	}

	public double getAccountBalance(int acctIdx) {
		return this.accounts.get(acctIdx).getBalance();
	}

	public String getAccountUserId(int acctIdx) {

		return this.accounts.get(acctIdx).getAccountNumber();

	}
	
	public void addAccountTransaction(int acctIdx,double amount,String memo) {
		
		this.accounts.get(acctIdx).addTransaction(amount ,memo);
		
	}

}
