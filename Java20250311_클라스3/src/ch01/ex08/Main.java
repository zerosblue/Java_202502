package ch01.ex08;

public class Main {

	public static void main(String[] args) {
		
		A aa = new A();
		aa.funcA();
		
		B bb = new B();
		bb.funB();
		
		B b2 = new B("지리산",50,"전남 남원");

		b2.info();
	}

}
