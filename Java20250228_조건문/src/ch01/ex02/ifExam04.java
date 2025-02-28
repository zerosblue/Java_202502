package ch01.ex02;

public class ifExam04 {

	public static void main(String[] args) {
		/*
		 * 학점계산
		 * 90 : A
		 * 80 : B
		 * 70 : C
		 * 60 : D
		 * 60미만 : F */

		
		int grade = 50;
		
	
		
		if(grade >= 90) {
			
			System.out.println("B학점");		
		}else if(grade>=80){
			 System.out.println("B학점");		
		}else if(grade >= 70) {
			System.out.println("C학점");
		}else if(grade >= 60) {
			System.out.println("D학점");
		}else {System.out.println("F학점");		
		}
		

		System.out.println("종료");
		

		
		
	}

}
