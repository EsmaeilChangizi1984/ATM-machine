package Banking_AutoBoxing_Application;

import java.util.ArrayList;

public class Branches {

	private String name;
	private ArrayList<Customers> customers;

	public Branches(String name) {
		this.name = name;
		this.customers = new ArrayList<Customers>();
	}

	public String getName() {
		return name;
	}

	public boolean addNewCustomer(String customerName, double amount) {
		if (findCustomer(customerName) == null) {
			customers.add(new Customers(customerName, amount));
			return true;
		}
		return false;
	}

	public boolean addCustomerTransaction(String customerName, double amount) {
		Customers existingCustomer = findCustomer(customerName);
		//new Customers(customerName,amount);//
		if (existingCustomer != null) {
			existingCustomer.addTransaction(amount);
			return true;
		}
		return false;
	}

	

	public ArrayList<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customers> customers) {
		this.customers = customers;
	}

	public Customers findCustomer(String customerName) {
		for (int i = 0; i < customers.size(); i++) {
			if (this.customers.get(i).getName().equals(customerName)) {
				return this.customers.get(i);
			}
		}
		return null;
	}

}
