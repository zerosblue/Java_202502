package ch01.ex02;

public class MainClass {

	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		
		B b1 = new B();
		b1.test();
		
		C c1 = new C();
		c1.test();
		
		System.out.println("====================");
		
		A a2 = new C();
		a2.test();
		
		A a3 = new B();
		a3.test();
		
		B b2 = new C();
		b2.test();
		
		
		
	}

}
