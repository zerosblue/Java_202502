package ch01.ex02;

public class MarinPerson {

	public static void main(String[] args) {
		UniversityStudent  u1 = new UniversityStudent("지리산",20,"한체대",3, "전산");
		u1.introduce();
		Person p1 = new Person("내장산",20);
		p1.introduce();
		Student s1 = new Student("치약산 ",15, "천호초등학교", 3);
		s1.introduce();
	
		System.out.println("--------------------------------------");	
		
		System.out.println(p1);
		System.out.println(s1.toString());
		System.out.println(u1);

		System.out.println("--------------------------------------");	
		
		Person p2 = new Student();
		
		Student s2 = new UniversityStudent();
		
		System.out.println("---------하위클라스는 상위 참조 불가---------");	
		//Student s3 = new Person();
		System.out.println("---------하위클라스는 상위 참조 가능한경우------");	
		
		Person p4 = new Student();
		Student s4 = (Student)p4;//가능 기능의 제한이 없음
		
		//p4 = new Person();
		//s4 = (Student)p4;//불가
		System.out.println("---------다형성=>자동변환------");	
		
		Person p5 = new Person();
		p5.sleep();
		p5.introduce();
		System.out.println(p5);
		
		p5 = new Student();
		p5.sleep();
		p5.introduce();
		System.out.println(p5);
		
		p5= new UniversityStudent();
		p5.eat();
		p5.introduce();
		System.out.println(p5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

