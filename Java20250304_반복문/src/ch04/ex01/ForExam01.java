package ch04.ex01;

public class ForExam01 {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * for, while -> 조건을 만족하는 순간까지 계속 반복
		 * for -> 반복횟수를 알때
		 * while -> 몇번을 반복하는지를 모를때
		 * do-while -> 조건을 만족하는 순간가지 계속반복(단, 최소1회는 보장)
		 */
		
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			sum += i;
			
		}
		
		System.out.println("sum="+sum); 
		
		

	}

}
