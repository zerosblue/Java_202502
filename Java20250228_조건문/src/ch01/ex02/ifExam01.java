package ch01.ex02;

public class ifExam01 {

	public static void main(String[] args) {
		
		/*
		 *조건문
		 *1. if
		 *2. if ~else : if 조건이 만족하지 못하면 else가 실행됨
		 *3. if ~elseif~else : 경우의 수가 많을때 
		 *swich문 존재
		 *
		 */
		
		int kor = 80;
		int eng = 80;
		
		if(kor >= 70) {
			System.out.println("합격");
		}
		if(kor < 70) {
			System.out.println("불합격");
		}
		if(eng >= 70) {
			System.out.println("합격");
		}	
		System.out.println("종료");
		

		
		
	}

}
