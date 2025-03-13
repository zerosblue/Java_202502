package ch01.ex03;

public class Student extends Person{

	
		
		private String schoolName;
		private int grade;
		Student(){}
		Student(String name, int age, String schoolName, int grade){
			super(name,age);
			this.schoolName = schoolName;
			this.grade = grade;
		}
		
		void study() {}
		@Override
		public String toString() {
			return schoolName+","+ grade + "입니다";
		}
		
		@Override
		void introduce() {
			System.out.println("안녕하세요. 저는 "+ schoolName +"에 다니는 "+grade+"학년 "+getAge()+"살"+getName()+"입니다");
		}

	
}
