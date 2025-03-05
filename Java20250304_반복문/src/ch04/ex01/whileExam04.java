package ch04.ex01;

import java.util.Scanner;

public class whileExam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수입력>>");
		int number = sc.nextInt();
		int i=1;
		
		while(i<=number) {
			if(i%2 ==1)
				sum +=i;
			i++;
		}
		System.out.println(sum);


		


	}

}
