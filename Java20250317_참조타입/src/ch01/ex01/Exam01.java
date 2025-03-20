package ch01.ex01;

public class Exam01 {

	public static void main(String[] args) {
		
		String hobby = "여행";
		hobby = null;
		
		String name = "여행";
		System.out.println(name.length());
		
		String temp = name;
		name = "영화";
		System.out.println(name);
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		System.out.println(name1==name2);
		
		String name3 = ("홍길동");
		String name4 = ("홍길동");
		
		System.out.println(name3==name4);
		System.out.println(name3.equals(name4));
		
		String old1 = "자바 프로그래밍";
		
		}

}
