package java1;

public class Account {
	 double balance =5000;
	
	Account(double balance ){
		this.balance=balance;
		
	}
	public synchronized void deposit(double amt) {
		this.balance+=amt;
		notifyAll();
	}
	public synchronized void withDraw(double amt) {
		if(balance<amt) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.balance -=amt;
	}
	public void print() {
		System.out.println(balance);
	}
	
	

}
