package ch01.ex03;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	Person(){}
	Person(String name,int age){
		this.name = name;
		this.age =age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	void sleep() {}
	void eat() {}
	
	@Override
	public String toString() {
		return name + "." + age + "입니다.";
				 
	}
	
	void introduce() {
		System.out.println("안녕하세요. 저는 "+ name +"이고, 나이는 "+age+"입니다");
	}

}
