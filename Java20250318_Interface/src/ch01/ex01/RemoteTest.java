package ch01.ex01;

public class RemoteTest {

	public static void main(String[] args) {
		
		RemoteControl remote = new Radio();
		remote.turnOn();
		System.out.println(RemoteControl.MAX_VOLUME);;
		System.out.println(RemoteControl.MIN_VOLUME);;
		System.out.println(B.number); 
		

	}

}
class A{
	public static int number = 100;
	
}
class B{
	public static int number = 100;
	
}
