package ex01;

public class ExceptionExam09 {

	public static void main(String[] args) {
		
		int result = 0;
		try {
			result = divide(10,0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		System.out.println("프로그램 종료");
		

	}
	public static int divide(int num1, int num2)throws ArithmeticException{
		if(num2 ==0)
			throw new ArithmeticException("0으로 나눌수는 없습니다");
		int result =num1/num2;
		return result+100;
		
	}

}
