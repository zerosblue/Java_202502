package ch01.ex01_1;

public class SmartTelevision implements RemoteControl,Searchable{
	
	@Override
	public void trunOn() {
		System.out.println("티비를 켭니다");
	}
	@Override
	public void trunOff() {
		System.out.println("티비를 끕니다");
	}
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다");
		
	}
	


}
