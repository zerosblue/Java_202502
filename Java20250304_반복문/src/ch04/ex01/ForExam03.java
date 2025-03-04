package ch04.ex01;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {
		/*
		 * 키보드 숫자를 입력 받는다
		 * 5-->1~15출력합 15
		 * 10 -->1~10까지 누적합 55
		 * 100 -->1~100까지 누적 550
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 :");
		int num = sc.nextInt();
		int sum = 0;
		
		
		for(int i=1; i<=num; i++) {
			if(i%2 ==1) //1~100까지중 홀수만
			sum += i;
			
		}
		
		System.out.println(sum);
		


	}

}
