package ch02.e01;

public class Person {
	/*맴버 변수 => 값 세팅
	 * 1. 생성자
	 * 2. setter
	 * 3. getter
	 * */
	private String name;
	private int age;
	private String phone;
	
	//생성자
	public Person() {
		System.out.println("Person()");
	}
	//생성자
	public Person(String n) {
		System.out.println("Person(String n)");
		name = n;
	}
	//생성자
	public Person(String n,int a, String p) {
		System.out.println("Person(String n,int age, string p)");
		name = n;
		age = a;
		phone = p;
		
	}
	void setName(String n) {
		name = n;
	}
	void setAge(int a) {
		age = a;
	}
	
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}

	
	
	private void run() {
		System.out.println(name +"달리다!");
	}
	void Sleep() {
		System.out.println(name +"자다!");
	}
	void eat() {
		System.out.println(name + "먹다!");
	}
	
}
