package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제1 {

	public static void main(String[] args) {
		
		/* 키보드를 통해서 국어점수를 입력받는다
		 * 70이상이면 합격이 출력 되고 70미만이면 불합격 메세지 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 :");
		
		int score = sc.nextInt();
		String result = (score  >= 70)?  "축하드립니다 합격하셨습니다" : "축하드립니다 불합격하셨습니다 일년더 고생하시기 바랍니다";
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println(result);
		System.out.println("----------------------------------------");
		
		

	}

}
