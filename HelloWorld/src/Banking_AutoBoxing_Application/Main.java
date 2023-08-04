package Banking_AutoBoxing_Application;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank("RBC");
		//Branches branch = new Branches("Bank");
		
		bank.addBranch("Orangeville");
		
		bank.addCustomer("Orangeville","Esmaeil",1200);
		bank.addCustomer("Orangeville","Mike", 1000);
		bank.addCustomer("Orangeville","John",2000);
		
		bank.listCustomers("Orangeville",true);
		
		
//		bank.addBranch("CIBC");
//		bank.addCustomer("CIBC","Kim", 10000);
//		
//		bank.addCustomerTransaction("Royal Bank","Mike",100);
//		bank.addCustomerTransaction("Royal Bank","Esmaeil",200);
//		bank.addCustomerTransaction("Royal Bank","Mike", 300);
//		
		
		
		

	}

}
