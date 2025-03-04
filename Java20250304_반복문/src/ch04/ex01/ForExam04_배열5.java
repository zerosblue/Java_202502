package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열5 {

	public static void main(String[] args) {
		//5명의 점수를 입력받아 총점 평균을 구하자
		Scanner sc = new Scanner(System.in);
		int [] student = new int[]{-1,-3,-700,1,2,9,3};
		
		
		int sum = 0;
		
		for(int i=0; i<7; i++) {

			sum += student[i];
		}	
		
		double average = sum /7.0;
		System.out.printf("총점 : %d, 평규 : %2f\n",sum, average);
		System.out.println("7번째 값 출력 : "+ student[6]);
		
		System.out.println("-----------------------------------");
		// max(99,88,77,33,44,80,40)
		
		int max = student[0];
		int min = student[0];
		
		for(int i=0;i<7;i++) {
			
			if(max < student[i])
				max = student[i];
			
			if(min > student[i])
				min = student[i];
			
		}
		
		
		System.out.println("최대값 : " + max); //100
		System.out.println("최소값 : " + min); //33
		
		System.out.println("-----------------------------------");
		/*
		 * (-1,-3,-700,1,2,9,3)
		 * 카보드 : 1을 입력하면 출력 1같은 4번째 위치입니다
		 * 키보드 : -3을 입력하면 출력 : -3값은 2번째 위치 입니다
		 * 
		 * 반복문, 조건문 이용
		 */
		int index = -1;
		System.out.print("찾을 숫자를 입력하세요");
		int numA = sc.nextInt();
		

		
		for (int i=0;i<7;i++) {
			if(numA == student[i]) {
				index = i;
				
			}
		}
		
		if(index != -1)
	
		System.out.printf("%d 값은 %d번째 위치입니다.\n", numA, index+1);
		
		else
			System.out.printf("%d값을 찾을수없습니다.\n ", numA);
		
		
		
		}

	 
		
		
	}




