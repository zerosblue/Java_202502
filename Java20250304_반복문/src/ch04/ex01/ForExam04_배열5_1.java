package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열5_1 {

	public static void main(String[] args) {
		//7명의 점수를 입력받아 총점 평균을 구하자
		Scanner sc = new Scanner(System.in);
		int [] student = new int[] {100,98,88,79,77,75,80};
		
		int sum = 0;
		double average = 0;
		
		for(int i=0; i<7; i++) {
			sum += student[i];
					
			
		}
		average = sum/7.0;
		
		System.out.println("----------------------------------------------");
		System.out.printf("합계는 %d이고 평균은 %f 입니다\n",sum,average);
		System.out.println("7번째 값은"+student[6]+"입니다");
		System.out.println("----------------------------------------------");
		
		// max,min(99,88,77,33,44,80,40)
		
		int max = student[0];
		int min = student[0];
		
		for(int i=0; i<7; i++) {
			if(max < student[i])
				max = student[i];
			if(min > student[i])
				min = student[i];
			
			
		}
		System.out.println("최대값은 "+ max +"입니다");
		System.out.println("최소값은 "+ min +"입니다");
		System.out.println("----------------------------------------------");
		/*
		 * (100,98,88,79,77,75,80)
		 * 카보드 : 1을 입력하면 출력 1같은 4번째 위치입니다
		 * 키보드 : -3을 입력하면 출력 : -3값은 2번째 위치 입니다
		 * 
		 * 반복문, 조건문 이용
		 */
		
		int index = -1;
		System.out.println("숫자를 지정하세요");
		int numA = sc.nextInt();
		
		for(int i = 0; i<7 ; i++ )
			if(numA == student[i]) {
				index = i;
			}
		if(index != -1)
			System.out.printf("%d 값은 %d번째 위치입니다.\n", numA, index+1);
		else
			System.out.printf("%d 값은 찾을수 없습니다",numA);
			
		
		
			

	}
}