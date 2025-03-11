package ch01.ex03;

/*사람 클라스
 * 사람 특징 name age..etc
 * 사람동장 run study eat ...etc
 * 간추려 만드는 과정으 추상화*/
public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		this("남산",1);
//		name = "남산";
	//	age = 1;
		
	}
	public Person(String name) {
		this(name,1);
//		this.name=name;
//		age =1;
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	String displayInfo() {
		return name + ":"+age;
	}
	
	void run() {
		System.out.println("run**************");
	}
	void eat() {
		System.out.println("eat**************");
	}

}
