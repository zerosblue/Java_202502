package ex01;

import java.util.Scanner;

public class ExceptionExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력>");
		int num1 = sc.nextInt();
		int num2 = 0;
		
		while(true) {
			num2 = sc.nextInt();
			
			if(num2 ==0 ) {
				
			System.out.println("0을입력하지마세요");
			System.out.println("0제외 정수입력>");
			System.out.println();
			
			continue;
		}
		break;
		}
		
		System.out.println("합 : :"+(num1+num2));
		System.out.println("뺄셈 : :"+(num1-num2));
		System.out.println("곱셈 : :"+(num1*num2));
		System.out.println("나누기 : :"+(num1/num2));
		System.out.println("프로그램종료");		

	}

}
