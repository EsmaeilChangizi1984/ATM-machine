package ATM;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

	private String name;
	private ArrayList<User> users;
	private ArrayList<Account> accounts;

	public Bank(String name) {
		this.name = name;
		this.users = new ArrayList<User>();
		this.accounts = new ArrayList<Account>();
	}

	public String getNewUserID() {

		String userId;
		Random rng = new Random();
		int len = 6;
		boolean nonUnique = false;

		do {
			userId = "";
			for (int i = 0; i < 6; i++) {
				userId += ((Integer) rng.nextInt(10)).toString();
			}
			for (User u : this.users) {
				if (userId.compareTo(u.getUserID()) == 0) {
					nonUnique = true;
					break;
				}
			}
		} while (nonUnique);

		return userId;
	}

	public String getNewAccountID() {
		String userId;
		Random rng = new Random();
		int len = 6;
		boolean nonUnique = false;

		do {
			userId = "";
			for (int i = 0; i < 6; i++) {
				userId += ((Integer) rng.nextInt(10)).toString();
			}
			for (Account a : this.accounts) {
				if (userId.compareTo(a.getAccountNumber()) == 0) {
					nonUnique = true;
					break;
				}
			}
		} while (nonUnique);
		return userId;

	}

	public void addAccount(Account anAcct) {
		this.accounts.add(anAcct);
	}

	public User addUser(String firstName, String lastName, String pin) {

		User newUser = new User(firstName, lastName, pin, this);
		this.users.add(newUser);

		Account newAccount = new Account("saving", newUser, this);

		newUser.addAccount(newAccount);
		this.addAccount(newAccount);

		return newUser;
	}

	public User userLogin(String userID, String pin) {	
		for (User u : this.users) {
			if (u.getUserID().compareTo(userID) == 0 && u.validatePin(pin)) {
				return u;
			}
		}
		return null; // if id dose not match.
	}

	public String getName() {
		return this.name;
	}

}
