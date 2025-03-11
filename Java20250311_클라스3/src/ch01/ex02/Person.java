package ch01.ex02;

/*사람 클라스
 * 사람 특징 name age..etc
 * 사람동장 run study eat ...etc
 * 간추려 만드는 과정으 추상화*/
public class Person {
	
	private String name;
	private int age;
	
	void run() {
		System.out.println("run**************");
	}
	void eat() {
		System.out.println("eat**************");
	}

}
