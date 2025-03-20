package ex01;

import java.util.Scanner;

public class ExceptionExam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("합 : :"+(num1+num2));
		System.out.println("뺄셈 : :"+(num1-num2));
		System.out.println("곱셈 : :"+(num1*num2));
		System.out.println("나누기 : :"+(num1/num2));
		System.out.println("프로그램종료");	
		
		int[]arr = new int[5];
		String str = null;
		
		
		try {
			System.out.println("나누기 : :"+(num1/num2));
			arr[5] = 10;
			System.out.println(str.length());
			
			System.out.println("나누가 : :"+(num1/num2));
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌때 발생");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 공간부족");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("참조값이 없다");
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			}
		System.out.println("프로그램 종료");
		



	}

}
