package ATM;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Bank theBank = new Bank("Royal Bank Canada");

		// adding first user with saving Account
		User user = theBank.addUser("Esmaeil", "Changizi", "12345");

		Account newAccount = new Account("Chacking", user, theBank);
		user.addAccount(newAccount);
		theBank.addAccount(newAccount);

		User curUser;
		while (true) {

			// stay in login prompt until successful login
			curUser = ATM.mainMenuPrompt(theBank, sc);

			ATM.printUserMenu(curUser, sc);
		}

	}

////////////////////////////////////////////////////////////////////////////////
	public static User mainMenuPrompt(Bank theBank, Scanner sc) {
		String userID;
		String pin;
		User authUser;

		do {
			System.out.printf("\n WELCOME TO %s\n", theBank.getName());
			System.out.println("\n Enter user ID : ");
			userID = sc.nextLine();
			System.out.println("Enter pin Number :");
			pin = sc.nextLine();

			authUser = theBank.userLogin(userID, pin);
			if (authUser == null) {
				System.out.println("Incorrect userid/pin number.please try again.");
			}
		} while (authUser == null);
		return authUser;
	}

/////////////////////////////////////////////////////////////////////////////
	public static void printUserMenu(User user,Scanner sc) {
		user.printAccountsSummary();
		
		int choice;
		
		do {
			
			System.out.printf("Welcome %s ,what you would like you to do?\n ",user.getFirstName());
			System.out.println(" 1) Show account Transaction");
			System.out.println(" 2) Withdraw.");
			System.out.println(" 3) Deposit.");
			System.out.println(" 4) Transfer.");
			System.out.println(" 5) Quit.\n");
			
			System.out.println("Enter your choice.");
			choice = sc.nextInt();
			
			if(choice<1 || choice>5) {
				System.out.println("Invalid choice,Enter 1-5");
			}
					
		}while(choice<1 || choice>5);
		
		
		switch(choice){
		
		case 1:
			ATM.showTransHistory(user,sc);
		    break;
		case 2:
			ATM.withdrawFunds(user,sc);
			break;
		case 3:
			ATM.depositFunds(user,sc);
			break;
		case 4:
			ATM.transferFunds(user,sc);
			break;		
		}
		
		if(choice != 5) {
			ATM.printUserMenu(user, sc);
		}	
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void showTransHistory(User user, Scanner sc) {

		int theAcct;

		do {
			System.out.printf("Enter the number (1-%d) of the accounts\n" + "whose transaction you want to see.",
					user.numAccounts());
			theAcct = sc.nextInt() - 1;
			if (theAcct < 0 || theAcct >= user.numAccounts()) {
				System.out.println("Invalid input");
			}

		} while (theAcct < 0 || theAcct >= user.numAccounts());

		user.printAcctTransHistory(theAcct);

	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void transferFunds(User user, Scanner sc) {

		int fromAcct;
		int toAcct;
		double amount;
		double acctBal;

		do {
			System.out.printf("Enter the number (1-%d) of the account to transfer from : ",user.numAccounts());

			fromAcct = sc.nextInt() - 1;
			if (fromAcct < 0 || fromAcct > user.numAccounts()) {
				System.out.println("Invalid input , please try again!");
			}

		} while (fromAcct < 0 || fromAcct > user.numAccounts());

		acctBal = user.getAccountBalance(fromAcct);

		do {
			System.out.printf("Enter the number (1-%d) of the account to transfer to : ");

			toAcct = sc.nextInt() - 1;
			if (toAcct < 0 || toAcct > user.numAccounts()) {
				System.out.println("Invalid input , please try again!");
			}

		} while (toAcct < 0 || toAcct > user.numAccounts());

		// Transfer the amount

		do {
			System.out.printf("Enter the amount to transfer (max%.02f) $", acctBal);
			amount = sc.nextDouble();

			if (amount < 0) {
				System.out.println("Amount should be greater than zero");
			} else if (amount > acctBal) {
				System.out.printf("Amount should not greater than (max %.o2f) $", acctBal);
			}

		} while (amount < 0 || amount > acctBal);

		user.addAccountTransaction(fromAcct, -1 * amount,
				String.format("Transfer to account %s ", user.getAccountUserId(toAcct)));
		user.addAccountTransaction(toAcct, -1 * amount,
				String.format("Transfer to account %s ", user.getAccountUserId(fromAcct)));

	}

	/////////////////////////////////////////////////////////////////////////////////////////////

	public static void withdrawFunds(User user, Scanner sc) {

		int fromAcct;
		double amount;
		double acctBal;
		String memo;

		do {
			System.out.printf("Enter the number (1-%d) of the account to withdraw from : ",user.numAccounts());

			fromAcct = sc.nextInt() - 1;
			if (fromAcct < 0 || fromAcct > user.numAccounts()) {
				System.out.println("Invalid input , please try again!");
			}

		} while (fromAcct < 0 || fromAcct > user.numAccounts());

		acctBal = user.getAccountBalance(fromAcct);

		do {
			System.out.printf("Enter the amount to transfer (max%.02f) $", acctBal);
			amount = sc.nextDouble();

			if (amount < 0) {
				System.out.println("Amount should be greater than zero");
			} else if (amount > acctBal) {
				System.out.printf("Amount should not greater than (max %.o2f) $", acctBal);
			}

		} while (amount < 0 || amount > acctBal);

		sc.nextLine();

		System.out.println("Enter the memo .");
		memo = sc.nextLine();

		user.addAccountTransaction(fromAcct, -1 * amount, memo);

	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	
	public static void depositFunds(User user,Scanner sc) {
		
		int toAcct;
		double amount;
		double acctBal;
		String memo;

		do {
			System.out.printf("Enter the number (1-%d) of the account to doposit to : ",user.numAccounts());

			toAcct = sc.nextInt() - 1;
			if (toAcct < 0 || toAcct > user.numAccounts()) {
				System.out.println("Invalid input , please try again!");
			}

		} while (toAcct < 0 || toAcct > user.numAccounts());

		acctBal = user.getAccountBalance(toAcct);

		do {
			System.out.printf("Enter the amount to transfer (max%.02f) $", acctBal);
			amount = sc.nextDouble();

			if (amount < 0) {
				System.out.println("Amount should be greater than zero");
			} 

		} while (amount < 0);

		sc.nextLine();

		System.out.println("Enter the memo .");
		memo = sc.nextLine();

		user.addAccountTransaction(toAcct, amount, memo);

		
	}

}
