package ch01.ex01_1;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		
		RemoteControl rc = new SmartTelevision();
		rc.trunOn();
		rc.trunOff();
		
		Searchable searchable = new SmartTelevision();
		Searchable.search("http://www.youtube.com");
	}

}
