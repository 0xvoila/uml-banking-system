import java.util.ArrayList;

public class Customer {

	private int customerId;
	private String customerName = null;
	private ArrayList<Account> customerAccounts = null;
	private ArrayList<Loan> customerLoans = null;
	
	public Customer(int customerId, String customerName){
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public boolean attachLoanToCustomer(Loan loan){
		this.customerLoans.add(loan);
		return true;
	}
	
	public boolean attachAccountToCustomer(Account account){
		this.customerAccounts.add(account);
		return true;
	}
	public int getCustomerId(){
		return this.customerId;
	}
	
	public String getCustomerName(){
		return this.customerName;
	}
	
	public ArrayList<Account> getCustomerAccounts(){
		return this.customerAccounts;
	}
	
	public ArrayList<Loan> getCustomerLoans(){
		return this.customerLoans;
	}
}
