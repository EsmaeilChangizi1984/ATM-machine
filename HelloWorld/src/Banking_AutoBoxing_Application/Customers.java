package Banking_AutoBoxing_Application;
import java.util.ArrayList;

public class Customers {
	private String name;
	private ArrayList<Double> Transaction;
	
	Customers(String name, double amount){
		this.name = name;
		this.Transaction = new ArrayList<Double>();
		addTransaction(amount);
	}

	

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransaction() {
		return Transaction;
	}

	public void addTransaction(double amount) {
		this.Transaction.add(amount);
	}
	
	

}
