package ch02.e01;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("김정명");
		
		p1.eat();
		
		Person p2 = new Person("홍길동",20,"010-0000-0000");
		
		p2.eat();
		
		p2.setName("정명");
		p2.eat();
		p2.setAge(100);
		
		
		String name = p2.getName();
		int age = p2.getAge();
		System.out.println(name);
		System.out.println(age);
		


	}

}
