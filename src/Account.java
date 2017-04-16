
public class Account {
	
	private int accountId;
	private Customer customer;
	private String accountDate = null;
	private String accountType = null;
	
	public Account(int accountId, Customer customer, String accountType){
		this.accountId = accountId;
		this.customer = customer;
		this.accountType = accountType;
	}
	
	public int getAccountId(){
		return this.accountId;
	}
	
	public Customer getAccountHolder(){
		return this.customer;
	}
	
	public String getAccountOpeningDate(){
		return this.accountDate;
	}
	
	public String getAccountType(){
		return this.accountType;
	}
}
