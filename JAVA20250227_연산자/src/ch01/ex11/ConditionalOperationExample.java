package ch01.ex11;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		
		int number = sc.nextInt();
//		String result = (number  > 0)?  "양수입력함" : "음수입력함";
		
		int result = (number > 0) ? number : -number;
		System.out.println(result);
		

	}

}
