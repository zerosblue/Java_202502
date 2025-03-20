package ex01;
import lombok.Getter;


class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	//자바에서는 객채 해시를 생성할때 필드를 혼합할 목적으로 주로 31소수값을 곱해줌
	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode():0;
		result=31*result+age;
		return super.hashCode();
		
	}
	public boolean equals(Object obj) {
		System.out.println("----------equals-------------");
		Person o = (Person)obj;
		return this.age == o.age && this.name ==o.name;
	}
}

public class PersonTest {

	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		System.out.println(str1.equals(str2));
		
		Person p1 = new Person("홍길동",10);
		Person p2 = new Person("박길동",20);
		System.out.println(p1.equals(p2));
		
		Person p3 = new Person("홍길동",10);
		Person p4 = new Person("박길동",20);
		
		System.out.println(p3.equals(p4));
		
		

	}

}
