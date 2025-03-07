package ch02.e04;

public class MainBankAccount {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("김정명",10000);
		
		b1.deposit(10000);
		b1.withdoaw(100000);
		b1.withdoaw(2000);
		
		System.out.println("현재잔액 : "+ b1.getBalance());
		

		

	}

}
