
public class Loan {

	private int loanId;
	private Customer customer;
	private int loanAmount; 
	private int alreadyPaidAmount;
	
	public Loan(int laonId , Customer customer, int loanAmount){
		this.loanId = loanId;
		this.customer = customer;
		this.loanAmount = loanAmount;
		this.alreadyPaidAmount = 0;
	}
	
	public int getLoanId(){
		return this.loanId;
	}
	
	public Customer getLoanOwner(){
		return this.customer;
	}
	
	public int getLoanAmount(){
		return this.loanAmount;
	}
	
	public int getAlreadyPaidAmount(){
		return this.alreadyPaidAmount;
	}
	
	public int paidLoanAmount(int amountPaid){
		this.alreadyPaidAmount = this.alreadyPaidAmount + amountPaid;
		return this.alreadyPaidAmount;
	}
}
