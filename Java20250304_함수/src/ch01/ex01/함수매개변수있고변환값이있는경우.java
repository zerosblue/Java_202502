package ch01.ex01;
/*
 ********* 함수 ***********
 * 입력(매개변수)    출력(반환값)
 *     o            o      
 *     o            x    
 *     x            o     
 *     x            o    
 *    함수정의 -> 함수를 만드는것
 *    함수호출 -> 만든 함수를 실행하는것 */
public class 함수매개변수있고변환값이있는경우 {

	public static void main(String[] args) {
		int result =sum(10,20); //함수호출
		System.out.println(result);
		System.out.println("프로그램 종료!!");
		
	}
	    //함수의 정의
		public static int sum(int n1, int n2) {
			//코드 구현
			System.out.println("void sum(int n1, int n2)함수 호출!!");
			
			return n1+n2; //return 값을 반한한다(n1+n2)=> 정수값 

			
		}
		
		


}
