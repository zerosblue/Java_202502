package ch01.ex01;

import java.util.Scanner;

public class Function03 {
	
	/* 반환타입이 존재하고 매개변수가 있는 */

	public static void main(String[] args) {
		
		String result = add();
		System.out.println("reesult" + result);
		
	}
	static String add() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("이름입력 >>");
		
		/*
		 * String name = sc.nextLine(); return name;
		 */
		return sc.nextLine();	}
		


}
