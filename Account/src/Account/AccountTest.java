package Account;

public class AccountTest {
	public static void main(String[] args){
		Account acc1 = new Account("account1");
		Account acc2 = new Account("account2");
		acc1.credit();
		acc1.balance();
		acc2.balance();
		acc2.credit();
		acc1.balance();
		acc2.balance();
		acc1.debit();
		acc1.balance();
		acc2.balance();
		acc2.debit();
		acc1.balance();
		acc2.balance();
	}
}
