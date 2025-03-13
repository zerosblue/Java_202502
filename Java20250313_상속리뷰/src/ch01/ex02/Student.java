package ch01.ex02;

public class Student extends Person{

	
		
		private String schoolName;
		private int grade;
		Student(){}
		Student(String name, int age, String Schoolname, int grade){
			super(name,age);
			this.schoolName = schoolName;
			this.grade = grade;
		}
		
		void study() {}
		void introduce() {
			System.out.println("안녕하세요. 저는 "+ schoolName +"에 다니는 "+grade+"학년"+getName()+"입니다");
		}

	
}
