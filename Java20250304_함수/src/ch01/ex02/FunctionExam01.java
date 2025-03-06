package ch01.ex02;
/*
 * 함수 2개 생성
 * 매개변수로 100 정수 값을 전달하면
 * 함수 1은 1~100 사이 홀수 있는값을 리턴하고
 * 함수 2는 1`100사이 짝수 갑을 리턴한다
 * 메인함수에서 두값을 호출하고 각 전달 값을 출력한다 */
public class FunctionExam01 {

	public static void main(String[] args) {
		int number = 100;
		int evenresult = evenSum(number);
		int oddresult = oddSum(number);
		System.out.println("짝수의 합 : " + evenresult);
		System.out.println("홀수의 합 : " + oddresult);

		}
		
	
	public static int evenSum(int number) {//짝수합
		int sum =0;
		for(int i =0; i<number;i++) {
			if(i%2==0)
				sum += i;
		}
		return sum;
}
	
	public static int oddSum(int number) {//홀수
		int sum =0;
		for(int i =0; i<number;i++) {
			if(!(i%2==0))
				sum += i;
	}
		return sum;
	    }
		
}
