package ch10.Ex01;

public class MainMember {

	public static void main(String[] args) {
		

		Member member0 = new Member("홍길동", "hong", "password0", 25);
        Member member1 = new Member("김정명", "kdm123", "password1", 25);
        Member member2 = new Member("홍길동", "hdong456", "password2", 30);
        Member member3 = new Member("이순신", "lee789", "password3", 35);
        Member member4 = new Member("박지민", "park321", "password4", 28);
        Member member5 = new Member("최유리", "choyi654", "password5", 22);
        
       member0.displayInfo();
       member1.displayInfo();
       member2.displayInfo();
       member3.displayInfo();
       member4.displayInfo();
       member5.displayInfo();
		


	}

}
