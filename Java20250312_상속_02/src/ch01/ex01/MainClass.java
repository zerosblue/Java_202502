package ch01.ex01;

public class MainClass {

	public static void main(String[] args) {
		
		C c1 = new C("지리산","전북",40);
		c1.funcA();
		c1.funcB();
		c1.funcC();
		
		B b1 = new B("남산","서울");
		b1.funcA();
		b1.funcB();
		
		A a1 = new A("내장산");
		a1.funcA();
		System.out.println("------자동타입변환------");
		
		A a2 = new B("치약산","원주");
		a2.funcA();
		
		A a3 = new C("한라산","제주",31);
		a3.funcA();

	}

}
