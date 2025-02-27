package ch02.sec01;

public class ValueableUserExam {

	public static void main(String[] args) {
		
		/* 
		 * 변수명작성
		 * 영문자, 숫자 _  -> 단 숫자가 맨앞에올수는 없다
		 * 변수명은 상당한 주의가 필요함
		 * 변수명은 소문자로 기입하는데 두번째 단어에 첫글자는 대문자
		 * 변수명 첫글자는 소문자를 기입한다
		 * 변수명 대문자 기입시 변경하지말음(상수화) -final을 씀
		 */
		
		//국어점수 -> korScore(카멜표기법)
		//국어점수 kor_score(스네이크 표기법)
		
		final double PI = 3.14159;
	
		
		
     	int hour = 3;
		int minute = 5;
		System.out.println(hour+"시간 "+ minute +"분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 "+ totalMinute + " 분");

	}

}
