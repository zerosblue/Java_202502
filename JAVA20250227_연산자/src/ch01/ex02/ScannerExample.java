package ch01.ex02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		//키보드 통해서 입력 받기 !!
		
		System.out.print("문자 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc .nextLine();
		
		System.out.println("입력된 값 : " + str);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		num= num+1;
		
		System.out.println("입력된 값 : " + num);
		System.out.println("출력된 값 : " + num);
		
		
		
		
		

	}

}
