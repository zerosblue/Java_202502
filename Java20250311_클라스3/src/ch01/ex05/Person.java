package ch01.ex05;

/*static(정적) <==> 인스턴스
인스턴스 변수(맴버변수)인스턴스 매소드(맴버메소드)
정적변수 정적 매소드
*/
public class Person {
	
	private String name;
	private int age;
	
	static int count;//정적변수
	static void func() {
		System.out.println("정적 매소드 func()");
		count++;
		//eat();
		//age++;
	}
	


	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	String displayInfo() {
		return name + ":"+age;

		
	}
	
	void run() {
		count++;
		func();
		eat();
		run();
		System.out.println("run**************");
	}
	void eat() {
		System.out.println("eat**************");
	}

}
