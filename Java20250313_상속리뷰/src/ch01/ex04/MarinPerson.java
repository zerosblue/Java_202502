package ch01.ex04;

public class MarinPerson {

	public static void main(String[] args) {
		
		Person p2 = new UniversityStudent();
		UniversityStudent u2 =(UniversityStudent)p2;
		
		Person p1 = new Person();
		Student s1 = new Student();
		UniversityStudent  u1 = new UniversityStudent();
		
		method(u1);
		method(s1);
		method(p1);
		
	}
	static void method(Person p) {
		if(p instanceof UniversityStudent) {
			
			UniversityStudent u = (UniversityStudent)p;
			u.sleep();
			u.study();
			u.registerCourse();
		}else if(p instanceof Student) {
			Student s = (Student)p;
			s.sleep();
			s.study();
		}else {
			p.sleep();
		}
		System.out.println("-------------------------------------");
	}

}

