package ch01.ex01;

public class Television implements RemoteControl{

	@Override
	public void turnOn();{
		System.out.println("TV를 켭니다");
	}
	
}
