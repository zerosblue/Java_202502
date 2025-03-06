package ch01.ex03;

public class 함수오버로딩 {

	public static void main(String[] args) {
		functionA(10,2);
		
	}
	public static void functionA() {
		System.out.println("functionA()");
	}
	public static void functionA(int n) {
		System.out.println("functionA()");
	}
	public static void functionA(double n) {
		System.out.println("functionA()");
	}
	public static void functionA(int n1, int n2) {
		System.out.println("functionA()");
	}
}
