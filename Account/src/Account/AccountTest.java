package Account;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		CheckingAccount acc1 = new CheckingAccount(100.0, 50.0, 0.01, 0.07);
		CheckingAccount acc2 = new CheckingAccount(100.0, 1000.0, 0.1, 0.07);
		Scanner scan = new Scanner(System.in);
		double amount;
		
		System.out.printf("Account1 balance: $ %.2f\n \t현재 출금 가능액: $ %.2f",acc1.getBalance(), acc1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1: ");
		amount = scan.nextDouble();
		acc1.debit(amount);
		System.out.printf("Account1 balance: $ %.2f\n \t현재 출금 가능액: $ %.2f",acc1.getBalance(), acc1.getWithdrawableAccount());
		if(acc1.isBankrupted()){
			System.out.println("account1 went Bankrupt! \n");
		}
		account.passTime(1);
		System.out.printf("Account1 balance: $ %.2f\n \t현재 출금 가능액: $ %.2f",acc1.getBalance(), acc1.getWithdrawableAccount());
		if(acc1.isBankrupted()){
			System.out.println("account1 went Bankrupt! \n");
		}	
		account.passTime(5);
		System.out.printf("Account1 balance: $ %.2f\n \t현재 출금 가능액: $ %.2f",acc1.getBalance(), acc1.getWithdrawableAccount());
		if(acc1.isBankrupted()){
			System.out.println("account1 went Bankrupt! \n");
		}
		
		
	}
};