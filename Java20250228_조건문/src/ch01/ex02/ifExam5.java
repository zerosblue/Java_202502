package ch01.ex02;

public class ifExam5 {

	public static void main(String[] args) {
		/*
		 * 학점계산
		 * 90 : A
		 * 80 : B
		 * 70 : C
		 * 60 : D
		 * 60미만 : F */

		

	        int grade = 99;
	        
	        switch (grade / 10) {
	            case 10: 
	            case 9:
	                System.out.println("A학점");
	                break;
	            case 8:
	                System.out.println("B학점");
	                break;
	            case 7:
	                System.out.println("C학점");
	                break;
	            case 6:
	                System.out.println("D학점");
	                break;
	            default:
	                System.out.println("F학점");
	 	}
	        System.out.println("종료");

}
	}

