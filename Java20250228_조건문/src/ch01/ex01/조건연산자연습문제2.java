package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제2 {

	public static void main(String[] args) {
		
		/* 키보드를 통해서 국어점수와 영어점수 입력받는다
		 * 둘다 70이상이면 합격, 아니면 불합격
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 :");
		int korscore = sc.nextInt();
		
		String result = (korscore  >= 80) ? "상🎉(잘히네!!)" : 
			            (korscore  >= 60) ? "중🎉(공부좀해라!!)" :"하🎉(기술배워!!)" ;

		
		
			

		System.out.println();
		System.out.println("------------------------");
		System.out.println();
		System.out.println(result);
		System.out.println();
		System.out.println("------------------------");

		
		

	}

}
