import java.util.ArrayList;

public class Bank {

	private ArrayList<Customer> customerList = null;
	private ArrayList<Account> accountList = null;
	private ArrayList<Loan> loanList = null;
	private boolean isBankOpen = true;
	
	public Customer createNewCustomer(String customerName){
		// implementing composition
		
		// Somehow Bank will generate customerId for this customer 
		Customer newCustomer = new Customer(0 , customerName);
		customerList.add(newCustomer);
		return newCustomer;
	}
	
	public Account createNewAccount(Customer customer){
		// implementing composition
		Account newAccount = new Account(0,customer,"saving");
		customer.attachAccountToCustomer(newAccount);
		accountList.add(newAccount);
		return newAccount;
	}
	
	public Loan createNewLoan(Customer customer){
		// implementing composition
		Loan newLoan = new Loan(0,customer,10000);
		customer.attachLoanToCustomer(newLoan);
		loanList.add(newLoan);
		return newLoan;
	}
	
	public boolean closeBank(){
		this.isBankOpen = false;
		return true;
	}
	
	public boolean openBank(){
		this.isBankOpen = true;
		return true;
	}
	
	public boolean isBankOpen(){
		return this.isBankOpen;
	}
	
	public boolean isBankClose(){
		return !this.isBankOpen;
	}
}

