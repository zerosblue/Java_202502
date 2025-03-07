package ch02.e03;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String n, int a) {
		name= n;
		age= a;
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	
	void introduce() {
		System.out.println("안녕하세요 제 이름은 [" +name + "]이고, ["+ age +"]살입니다");
	}

}
