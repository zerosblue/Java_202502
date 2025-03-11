package ch01.ex05account;

public class Account {
	
	int balance;
	
	final int MIN_BALANCE = 0; 
	final private int MAX_BALANCE=1000000; 
	
	private static Account ac = new Account();
	public Account() {
		
	}
	static Account getInstance(){
		return ac;
	}
	
	void setBalance(int balance) {
		if(balance >=MIN_BALANCE && balance <=MAX_BALANCE)
			this.balance = balance;
		
		
	}

	int getBalance() {
		return balance;
		
	}

}
