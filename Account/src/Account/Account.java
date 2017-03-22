package Account;
import java.util.Scanner;

public class Account {
	private String accountName;
	private double money= 0 ;
	
	public void credit(){
		System.out.printf("Enter add amount for %s: ",accountName);
		Scanner input = new Scanner(System.in);
		double balance = input.nextDouble();
		money = money + balance;
	}
	
	public void debit(){
		System.out.printf("Enter withdrawl amount for %s: ",accountName);
		Scanner input = new Scanner(System.in);
		double balance = input.nextDouble();
		if(money < balance){
			System.out.printf("Debit amount exceeded account balance\n");
		}
		if(money > balance){
			money = money - balance;
		}
	}
	
	public void balance(){
		System.out.printf("%s balance: %f\n",accountName, money);
	}
	
	public Account(String accountName){
		this.accountName = accountName;
	}
}
