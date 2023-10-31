package java1;

import java.util.Scanner;

class DepositThread implements Runnable{
	Account acc;
	double amt;
	DepositThread(Account acc,double amt){
		this.acc=acc;
		this.amt=amt;
	}
	public void run() {
		acc.deposit(amt);
	}
}
class WithdrawThread implements Runnable{
	Account acc;
	double amt;
	WithdrawThread(Account acc,double amt){
		this.acc=acc;
		this.amt=amt;
	}
	public void run() {
		acc.withDraw(amt);
	}
}
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account(50000);
		double amt;
		int choice;
		Scanner sc= new Scanner(System.in);
		choice = sc.nextInt();
		while(true) {
			System.out.println("1 Deposit");
			System.out.println("2 WithDraw");
			System.out.println("3 check Balance");
			System.out.println(" 4 exit");
		}
		

	}

}
