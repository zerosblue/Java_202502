package ch01.ex01;

public class 복습 {

	public static void main(String[] args) {
		
		// 자료형 변슈 = 초기값;
		int num=0; //메모리 공간에서 영역을 하나 잡음(4byte)
		int num2 =0;
		int num3 =0;
		
		
		num = num +1; //num(1)
		num += 1;    //num(2)
		
		num2 = ++num; //전위연산자(증감) num(3)
		
		num3 = num++; //후위연산자(증감) num(4)
		
		
		System.out.printf("%d %d %d\n",num,num2,num3);
		

	}

}
