package ch01.ex02;

public class PersonMain {

	public static void main(String[] args) {
		
		/*이름,나이, 전화번호 입력하시고
		 * */
		
        Person p1 = new Person();
        p1.name = "홍길동";
        p1.phone = "010-1234-5678";
        p1.age = 25;

        p1.이름출력(p1.name);
        p1.나이출력(String.valueOf(p1.age)); 
        p1.전화번호출력(p1.phone);

        System.out.println("---------------------------");


		
		
		

	}

}
