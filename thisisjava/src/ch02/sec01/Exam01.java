package ch02.sec01;

public class Exam01 {

	public static void main(String[] args) {
		
		float f1 = 10.0f;
		float f2 = 10;
		double d1 = 10.0;
		
		System.out.println("f1 = "+f1 + "f2 = "+f2);
		// float(4)<double(8)
		
		// double > float ? Long > int > short > byte
				
		
		
		int a = 10;
		int b = 20;
		System.out.println("before:");
		System.out.println("a ="+a+", b ="+b);
		System.out.println("");
		
		
		int c = a;
		a=b;
		b=c;
		System.out.println("after:");
		System.out.println("a ="+a+", b ="+b+", c ="+c);
				

	}

}
