package ch01.ex05;

import java.util.Scanner;

public class Exam_문제2 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("초를 입력하세요: ");
        int totalSeconds = sc.nextInt();  // 정수 입력받기

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(hours + "시간 " + minutes + "분 " + seconds + "초");

        sc.close();  // Scanner 닫기
    }




		
		

	}


