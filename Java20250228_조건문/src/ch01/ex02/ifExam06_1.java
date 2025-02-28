package ch01.ex02;

import java.util.Scanner;

public class ifExam06_1 {

	public static void main(String[] args) {
		/*
		 * 버스요금 계산
		 * 기본요금 2000
		 * 1~5세 ㅁ: 무료
		 * 6~12세 : 50%할인
		 * 13~18세 : 25%할인
		 * 19~64세 : 0%할인
		 * 65세이상 : 무료
		 * */
	    Scanner sc = new Scanner(System.in);
	    int age = 0;
	    int fee = 2000;
	    double rate =0;
	    
	    System.out.print("나이 :");
	    age = sc.nextInt();
	    
	    if(age >=65 || age <= 5) {
	    	rate =0;
	    }else if(age>=6 && age <=12) {
	    	rate = 0.5;
	    }else if(age>=13 && age <= 18) {
	    	rate = 0.75;
	    }else if(age>=19 && age <= 64) {
	    	rate =1;
	    }

	    fee = (int)(fee*rate);
	    System.out.println("버스요금은 "+fee+"원 입니다");
	    		

									
	}
}
		


	
	


