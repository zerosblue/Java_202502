package ch01.ex01;

public class Function01 {
	
	/* 반환타입이 존재하고 매개변수가 있는 */

	public static void main(String[] args) {
		
		Function01 f1 = new Function01();
		int num1=10;
		int num2=20;
		int result = f1.add(num1, num2);
		
		System.out.println("Result : "+ result);
		
	}
	
	int add(int n1, int n2) {
		return n1+n2;
	}

}
