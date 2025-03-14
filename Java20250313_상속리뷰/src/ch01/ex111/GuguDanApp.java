package ch01.ex111;

public class GuguDanApp {

	public static void main(String[] args) {
		//1~20 난수 발생
		int dan =  (int)(Math.random()*20) +1;
		int number = (int)(Math.random()*20) +1;
		
		System.out.println(dan);
		System.out.println(number);
		
/*
1. dan 과 number 이 모두 1~9 사이이면 dan*number 의 구구단을 출력한다.
GuGuDanExpr 객체를 생성(생성자를 통해서 dan과 number에 대한 데이터를 전달하여 초기화한다.)하고
printPart() 를 호출한다. 단이 3, number가 4로 추출된다면 3 * 4 = 12 를 출력한다.

2. 
dan 은 1~9 사이이고 number 가 10 이상이면 GuGuDanExpr 객체를 생성
(생성자를 통해서 dan에 대한 정보를 전달하여 초기화한다.)하고 printPart() 를 호출한다.
추출된 dan의 숫자가 2 인 경우
2단 : 2 * 1 = 1 2 * 2 = 2 2 * 3 = 6 ………………

3.
dan 의 값이 10 이상이면 GuGuDanExpr 의 static 메서드 printAll() 을 호출하여 1단부터 9단까지의 값들을
행 단위로 출력한다.
 */
		
		if( (dan>=1 && dan <=9) && (number>=1 && number<=9)) {
			GuGuDanExpr expr = new GuGuDanExpr(dan, number);
			expr.printPart();
			
		}else if((dan>=1 && dan <=9) && number>=10) {
			GuGuDanExpr expr = new GuGuDanExpr(dan);
			expr.printPart();
		}else if(dan>=10) {
			GuGuDanExpr.printAll();
		}
			

	}

}
