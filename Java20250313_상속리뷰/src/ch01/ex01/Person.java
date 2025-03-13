package ch01.ex01;

public class Person {
	
	String name;
	private int age;
	private String gender;
	
	public int getAge() {
		return age;
	}
	void sleep() {}
	void eat() {}
	void introduce() {
		System.out.println("안녕하세요. 저는 "+ name +"이고, 나이는 "+age+"입니다");
	}

}
