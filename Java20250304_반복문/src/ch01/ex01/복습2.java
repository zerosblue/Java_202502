package ch01.ex01;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		
		
		/*
		 * 정수 : byte, short, char, int, long
		 * 실수 : float, double
		 * 논리 :boolean     boolean test = false
		 */
		
		// 객체   참조변수
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력>>");
		int number = sc.nextInt();
		
		//삼항연산자(조건연산자)
		// (조건판단) ? 참 : 거짓 ;
		String msg = (number>0) ? "양수":"음수";
		System.out.println(msg);
		
		

	}

}
