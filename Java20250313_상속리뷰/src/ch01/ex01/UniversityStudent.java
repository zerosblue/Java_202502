package ch01.ex01;

public class UniversityStudent extends Student{
 	
	
	private String major;
	private boolean isInterns;
	private int scholarship;
	
	void registerCourse() {}
	void introduce() {
		System.out.println("안녕하세요. 저는 "+ major +"를 전공하고 있는 "+ name +"입니다");
	}

}
