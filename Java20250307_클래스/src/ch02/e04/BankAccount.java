package ch02.e04;

public class BankAccount {
	
	private String owner;
	private double balance;
	
	public BankAccount(String owner, double balance) {
		this.owner =owner;
		this.balance =balance;
	}
	
	double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		
	}
	public void withdoaw(double amount) {
		balance -= amount;
	}

	public void balance(double amount) {
		if (amount > balance) {
			System.out.println("잔액 부족! ");
		} else {
			balance -= amount;
			
		}

	}
}
/*수정 요구사항
 * 1. withdraw() 매서드를 개선하여 잔액보다 많은 금액을 출금할경우 "잔액부족"을 출력하고 출금을 
 * 방지할것*
 * 2.getBalance() 매서드를 추가하여 현재 잔액을 반환할것
 * 3. main 매서드에서 BankAccount 객체를 생성하고 입굽 출금을 테스트 할것
 * 
 */