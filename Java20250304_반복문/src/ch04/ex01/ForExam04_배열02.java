package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열02 {

	public static void main(String[] args) {
		//5명의 점수를 입력받아 총점 평균을 구하자
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[5]; //배열선언 int 배열5개 있다
		
		
		System.out.println("1번학생 자바점수>>");
		num[0] = sc.nextInt();
		
		System.out.println("2번학생 자바점수>>");
		num[1] = sc.nextInt();
		
		System.out.println("3번학생 자바점수>>");
		num[2] = sc.nextInt();
		
		System.out.println("4번학생 자바점수>>");
		num[3] = sc.nextInt();
		
		System.out.println("5번학생 자바점수>>");
		num[4] = sc.nextInt();
		
		int sum = num[0]+num[1]+num[2]+num[3]+num[4];
		double average = sum /5.0;
		
		System.out.printf("총점 : %d, 평균 : %2f\n",sum, average);
		
		
		
	}



}
