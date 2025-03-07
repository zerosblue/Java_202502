package ch02.e01;

public class MainStudent {

	public static void main(String[] args) {
		
		//1.Student 객체 생성하면서 이름(홍길동), 학년(3), 나이 (20) 입력
		Student student = new Student("홍길동", 3, 20);
		
		//2. printInfo() 메소드 호출
		student.printInfo();

		//3. 이름을 이순신으로 변경
		 student.setName("이순신");
		//4. 변경된 이름 출력
		 String name = student.getName();
		 System.out.println("변경된 이름: " + student.getName());
		//5. 학년 5로 변경
		 student.setGrade(5);
		
		//6. 변경된 학년반 출력
		 System.out.println("변경된 학년: " + student.getGrade());
	}

}
