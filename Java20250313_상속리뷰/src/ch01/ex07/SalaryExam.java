package ch01.ex07;

import java.util.Scanner;

public class SalaryExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		System.out.println("등급을 입력하세요(1~4)");
		int grade = sc.nextInt();
		int salary = 0;
		SalaryExpr expr = null;
		
		expr = (month%2 ==0) ? new SalaryExpr(100): new SalaryExpr(0);
		salary = expr.getSalary(grade);
		
		System.out.printf("%d 월  %d 등급의 월급은 %d 입니다", month,grade,salary);
		

	}

}
