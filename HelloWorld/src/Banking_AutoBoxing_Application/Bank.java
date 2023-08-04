package Banking_AutoBoxing_Application;

import java.util.ArrayList;

public class Bank {

	private String name;
	ArrayList<Branches> branches;

	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<Branches>();
	}

	public boolean addBranch(String branchName) {
		if (findBranch(branchName) == null) {
			this.branches.add(new Branches(branchName));
			return true;
		}
		return false;
	}

	public boolean addCustomer(String branchName, String name, double amount) {
		Branches branches = findBranch(branchName);
		if (branches != null) {
			return branches.addNewCustomer(name, amount);

		}
		return false;
	}
	
	
	public boolean addCustomerTransaction(String branchName,String name,double amount) {
		Branches branches = findBranch(branchName);
		if(findBranch(name) != null) {
			branches.addCustomerTransaction(name, amount);
			return true;
		}
		return false; 
	}
	
	public Branches findBranch(String branchName) {
		for (int i = 0; i < branches.size(); i++) {
			if (branches.get(i).getName().equals(branchName)) {
				return branches.get(i);
			}
		}
		return null;
	}

	public boolean listCustomers(String branchName,boolean transaction) {
		Branches branches = findBranch(branchName);
		if(branches != null) {
			System.out.println("Customers for branch "+branches.getName());
			
			
			
			ArrayList<Customers> branchCustomers = branches.getCustomers();		
			for(int i=0 ; i<branchCustomers.size() ; i++) {
				Customers newcustomers = branchCustomers.get(i);
				System.out.println("Customer "+newcustomers.getName()+" [ "+(i+1)+" ]");
				
				if(transaction) {
					System.out.println("Transactions ");
					ArrayList<Double>Transactions = newcustomers.getTransaction();
					for(int j=0 ; j<Transactions.size(); j++) {
						System.out.println("[ "+(j+1)+" ] Amount "+Transactions.get(i));
					}
				}
			}
			return true;
		}
		else {
			return false;
		}
		
	}

}
