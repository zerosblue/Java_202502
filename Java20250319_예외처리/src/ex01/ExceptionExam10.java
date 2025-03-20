package ex01;

public class ExceptionExam10 {

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
		int result = num1/num2;
		return result+100;
		
	}

}
