package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열4 {

	public static void main(String[] args) {
		//5명의 점수를 입력받아 총점 평균을 구하자
		Scanner sc = new Scanner(System.in);
		int [] num = new int[7];
		int sum = 0;
		
		for(int i=0; i<7; i++) {
			System.out.println( i+1+"번학생 자바점수>>");
			num[i] =sc.nextInt();
			sum += num[i];
			
		}
		

		
		double average = sum /5.0;
		System.out.printf("총점 : %d, budrbs : %2f\n",sum, average);
		
		
		
	}



}
