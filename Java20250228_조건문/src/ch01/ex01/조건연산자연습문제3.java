package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제3 {

	public static void main(String[] args) {
		
		/* 키보드를 통해서 국어점수와 영어점수 입력받는다
		 * 둘다 70이상이면 합격, 아니면 불합격
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 :");
		int korscore = sc.nextInt();
		System.out.print("영어 점수 :");
		int engscore = sc.nextInt();
		
		String result = (korscore  >= 70 && engscore >=70)?  "축하드립니다 합격하셨습니다🎉" : "이걸점수라고.. 불합격하셨습니다 힘내세요💪";
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println(result);
		System.out.println("----------------------------------------");
		
		

	}

}
