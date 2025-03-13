package ch01.ex02;

public class A {
	
	private String name;
	
	A(String name){
		this.name = name;
	}
	A(){}
	
	void test() {
		System.out.println("A class");
	}
	void funcA(){
		System.out.println("funcA");
	}

}
class B extends A{
	private String address;
	B(){}
	B(String n2, String address){
		super(n2);
		this.address = address;
	}
	@Override
	void test() {
		System.out.println("B class");
	}
	void funcB(){
		System.out.println("funcB");
	}
}

class C extends B{
	private int age;
	C(){}
	C(String n, String a, int age){
		super(n,a);
		this.age =age;
	}
	@Override
	void test() {
		System.out.println("C class");
	}
	void funcC(){
		System.out.println("funcC");
	}
}