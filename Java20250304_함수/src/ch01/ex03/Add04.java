package ch01.ex03;

import java.util.Scanner;

/*
 * 2개 값을 입력해서 더하는 기능 수행
 * 매개변수있음 변환 있음*/
public class Add04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2=sc;
		
		int a =100;
		int b = a;
				
		
		System.out.println("main함수 시작");
		int num1 =(int)(Math.random()*100) +1;
		int num2 =(int)(Math.random()*100) +1;
		
		int result = add(num1,num2);

		System.out.println("result: "+ result);
		System.out.println("프로그램 종료");

	}
	public static int add(int numA, int numB) {
		
		System.out.println("add() 시작");
		
		System.out.println("numA="+numA+"numB="+numB);
		int sum = numA + numB;
		
		return sum;
		
	}

}
