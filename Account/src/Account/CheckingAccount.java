package Account;

public class CheckingAccount extends Account{
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	CheckingAccount(double balance, double credit_limit, double interest, double loan_interest){
		super(balance);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}
	
	@Override public void debit(double minus){
		if(minus > credit_limit){
			System.out.print("Debit amount is more thar credit limit! \n");
		}else if(getBalance() < minus){
			changeBalance(getBalance() - minus);
			System.out.print("Balance is minus!");
		}else {
			changeBalance(getBalance() - minus);
		}
	}
	
	public void nextMonth(){
		if(getBalance() < 0){
			changeBalance(getBalance() + getBalance() * loan_interest);
		} else {
			changeBalance(getBalance() + getBalance() * interest);
		}
	}
};
