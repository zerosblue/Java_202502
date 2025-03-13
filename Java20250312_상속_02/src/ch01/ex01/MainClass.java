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

		System.out.println("------강제타입변환------");
		
		A a4 = new B("백두산","함경북도");
		A b2 = new B("백두산","함경북도");
		a4.funcA();
		b2.funcA();
		
	
		/*
		 * A a5 = new A(); B b3 = new B(); b3 = (B)a5; b3.funcA();
		 */
		
		A a6 = new B();
		B b4 = new B();
		b4 = (B)a6;
		
		A a7=new C();
		B b5;
		b5 = (B)a7;
		b5.funcA();
		b5.funcB();
		
		A a8 = new C();
		C c2 ;
		c2 =(C)a8;
		
		A a10 = new A();
		B b6 = new B();
		a10 = b6;
		B b7 = (B)a10;
		b7.funcA();
		b7.funcB();
		
		
		
		
	}

}
