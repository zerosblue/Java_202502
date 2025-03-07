package ch01.ex01;

/*
 * 이름, 나이, 국어, 영어, 수학 => 정적 => 변수
 * 공부하기, 시험보기, 등교하기=> 동적인 특성 => 함수
 * */

public class 클래스도입 {

	public static void main(String[] args) {

		String name = "제로스";
		String phone = "010-3631-2728";
		int age, kor, eng, math;
		age = 20;
		kor =90;
		eng = 80;
		math =77;
		
		공부하기(name);
		시험보기(kor, eng,math);
		등교하기(name);
		
		System.out.println("--------------------------------");
		
		String name2 = "블루";
		String phone2 = "011-3631-2728";
		int age2, kor2, eng2, math2;
		age2 = 21;
		kor2 =98;
		eng2 = 80;
		math2 =77;
		
		공부하기(name2);
		시험보기(kor2, eng2,math2);
		등교하기(name2);
	}
	public static void 공부하기(String name) {
		System.out.println(name +"공부하기");
		
	}
	public static void 시험보기(int kor, int eng, int math) {
		int sum = kor + eng+math;
		System.out.println("세 과목의 합 : " + sum);
		
	}
	public static void 등교하기(String name) {
		System.out.println(name +"등교하기");
		
	}


}
