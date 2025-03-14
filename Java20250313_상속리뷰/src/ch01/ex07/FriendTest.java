package ch01.ex07;

public class FriendTest {

	public static void main(String[] args) {
	      // Friend 객체 5개 생성
        Friend[] friend = new Friend[5];
		
		friend[0] = new Friend("홍길동", "010-1234-5678", "hong@gmail.com");
        friend[1]  = new Friend("김철수", "010-9876-5432", "kimcs@yahoo.com");
        friend[2] = new Friend("이영희", "010-5555-7777", "leeyh@naver.com");
        friend[3] = new Friend("박지성", "010-9999-8888", "parkjs@soccer.com");
        friend[4] = new Friend("손흥민", "010-7777-9999", "son7@tottenham.com");

        System.out.println("===== 친구 목록 =====");
        
        for( int i = 0;i<friend.length;i++) {
        	
        	System.out.println(friend[i].toString());
        }
}
	}



