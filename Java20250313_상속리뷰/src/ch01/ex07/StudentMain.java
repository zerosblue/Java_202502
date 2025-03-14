package ch01.ex07;

public class StudentMain {

	public static void main(String[] args) {
		
		Student st1 = new Student("홍길동",20,171,81,"201101","영문");
		st1.toString();
		Student st2 = new Student("고길동",21,183,72,"201102","건축");
		st2.toString();
		Student st3 = new Student("박길동",22,1715,65,"201103","컴공");
		st3.toString();
		
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());

	}

}
