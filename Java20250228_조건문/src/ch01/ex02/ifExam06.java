package ch01.ex02;

import java.util.Scanner;

public class ifExam06 {

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
		    
			System.out.print("나이 :");
			int age = sc.nextInt();
			
			
			int fee = 2000;
			
			if(age >= 65 ) {
				System.out.println("버스요금은 " + fee *0  + "원입니다");
			}else if(age >= 19) {
				System.out.println("버스요금은 " +fee +"원입니다");			
			}else if(age >= 13) {
				System.out.println("버스요금은 " +(int)(fee *0.75) +"원입니다");				
			}else if(age >= 6) { 
				System.out.println("버스요금은 " +(int)(fee *0.5) +"원입니다");							
			}else {
				System.out.println("버스요금은 " + fee *0  + "원입니다");							
			}
									
	}
}
		


	
	


