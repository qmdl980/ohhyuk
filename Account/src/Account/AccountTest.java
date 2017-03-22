package Account;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		CheckingAccount acc1 = new CheckingAccount(100.0, 1000.0, 0.1, 0.07);
		CheckingAccount acc2 = new CheckingAccount(100.0, 1000.0, 0.1, 0.07);
		
		System.out.printf("Account1 balance: %f\n", acc1.getBalance());
		System.out.printf("Account2 balance: %f\n", acc2.getBalance());
		
		System.out.printf("Enter deposit amount for Account1: ");
		Scanner input = new Scanner(System.in);
		int inp = input.nextInt();
		acc1.credit(inp);
		
		System.out.printf("Account1 balance: %f\n", acc1.getBalance());
		System.out.printf("Account2 balance: %f\n", acc2.getBalance());
		
		System.out.printf("Enter withdrawl amount for Account2: ");
		Scanner input1 = new Scanner(System.in);
		int inp1 = input.nextInt();
		acc2.debit(inp1);
		
		System.out.printf("Account1 balance: %f\n", acc1.getBalance());
		System.out.printf("Account2 balance: %f\n", acc2.getBalance());
		
		System.out.printf("Next month!\n");
		acc1.nextMonth();
		acc2.nextMonth();
		
		System.out.printf("Account1 balance: %f\n", acc1.getBalance());
		System.out.printf("Account2 balance: %f\n", acc2.getBalance());
	}
};