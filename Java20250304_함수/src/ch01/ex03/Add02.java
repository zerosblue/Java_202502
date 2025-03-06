package ch01.ex03;

/*
 * 2개 값을 입력해서 더하는 기능 수행
 * 매개변수있음 변환 없음*/
public class Add02 {

	public static void main(String[] args) {
		System.out.println("main함수 시작");
		int num1 =(int)(Math.random()*100) +1;
		int num2 =(int)(Math.random()*100) +1;
		
		add(num1, num2);

		System.out.println(); 
		System.out.println("프로그래 종료");

	}
	public static void add(int numA, int numB) {
		
		System.out.println("add() 시작");

		System.out.println(numA+"+"+numB+"="+(numA+numB));
		
	}

}
