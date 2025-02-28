package ch01.ex02;

import java.util.Scanner;

public class 월계산프로그램 {

	public static void main(String[] args) {
		
		/*12,1,2:겨울
		 * 3,4,5:봄
		 * 6,7,8:여름
		 * 9,10,11:가을*/
		
	    Scanner sc = new Scanner(System.in);
	    System.out.print("월 : ");
	    int month = sc.nextInt();
	    String season = "";
	     

		
		if(month == 12 ||month == 1 ||month == 2  ) {
			season = "겨울";
		}else if(month == 3 ||month == 4 ||month == 5 ) {
			season = "봄";
			
		}else if(month == 6 ||month == 7 ||month == 8 ) {
			season = "여름";
		}else if(month == 9 ||month == 10 ||month == 11 ) {
			season = "가을";
		}
		System.out.printf("지금 입력한 %d달은 %s 입니다.\n " ,month,season);	

	}

}
