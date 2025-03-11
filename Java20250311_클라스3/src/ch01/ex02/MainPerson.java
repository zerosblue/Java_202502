package ch01.ex02;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1 = p2;

	}
	
	/*p1, p2는 참조하는 객체를 동시에 참조하게 된다
	 * 
	 * p1이 참조한 객체는 일정시간이 지나면 매모리 공간에서
	 * 소실된다
	 * */

}
