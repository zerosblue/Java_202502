package ch01.ex03;

public class PersonMain {

	public static void main(String[] args) {
		
		/*이름,나이, 전화번호 입력하시고
		 * */

		System.out.println("-------------------------------------");
		
		Person person
		= new Person("김정명",50,"010-3333-4444");
		person.age =20;
		
		
		person.나이출력();
		person.이름출력();
		person.전화번호출력();
		
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		


		Person p2 
		= new Person("홍길동",20,"011-711-7777");
		
		p2.나이출력();
		p2.이름출력();
		p2.전화번호출력();
		
		System.out.println("-------------------------------------");

	}

}
