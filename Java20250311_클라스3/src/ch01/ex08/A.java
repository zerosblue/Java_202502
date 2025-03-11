package ch01.ex08;


public class A {
	
	private String name;
	private int age;
	A() {}
	A(String name, int age){
		this.name = name;
		this.age = age;
	}
	void funcA() {
		
		System.out.println("funcA()");
			
		}
	void info() {
		System.out.println(name);
		System.out.println(age);
	}
}
class B extends A{
	
		private String address;
		
		B() {}
		B(String name, int age, String address){
			super(name,age);
			this.address = address;
		}
		//상위 클래스가 가진 매소드를 ==> 재정의 오버라이드
		@Override  // 상위클라스를 재정의하고잇다
		void info() {
			System.out.println("B class");
		}
		
		void infoB(){
			info();
			System.out.println(address);
			
		}
		void funB() {
			System.out.println("funcB()");
		}
	

}