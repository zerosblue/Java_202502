package ch01.ex05;

import java.util.Scanner;

public class Exam_문제1 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요 : ");
		String str = sc .nextLine();
		
		int totalSeconds = Integer.parseInt(str);
		
		
		int hour = totalSeconds/3600;
		int minute = ( totalSeconds % 3600 ) / 60;
		int second = totalSeconds % 60;
		
		System.out.println(hour+"시간 "+ minute +"분 "+second+"초");
		

				
		
	}

}
