package ch01.ex01;

public class Student extends Person{

	
		
		private String schoolName;
		private int grade;
		void study() {}
		void introduce() {
			System.out.println("안녕하세요. 저는 "+ schoolName +"에 다니는 "+grade+"학년"+name+"입니다");
		}

	
}
