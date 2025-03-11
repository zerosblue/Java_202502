package ch01.ex03;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("설악산",50);
		Person p2 = new Person("지리산",30);
		
		//String result = p1.displayInfo();
		
		System.out.println(p1.displayInfo());
		System.out.println(p2.displayInfo());
		
		System.out.println("=============================");
		Person p3 =new Person();
		System.out.println(p3.displayInfo());
		
		System.out.println("=============================");
		Person p4 =new Person("치약산");
		System.out.println(p4.displayInfo());
		
		

	}
	
	/*p1, p2는 참조하는 객체를 동시에 참조하게 된다
	 * 
	 * p1이 참조한 객체는 일정시간이 지나면 매모리 공간에서
	 * 소실된다
	 * */

}
