package ch01.ex05;

public class SamsungTV extends TV{
	
	@Override 
	void powerOn() {
		System.out.println("SamsungTV.");
		System.out.println("전원 on");
	}
		
	void powerOff() {
		System.out.println("SamsungTV.");
		System.out.println("전원 off");
	}
		   
	void volumeUp() {
		System.out.println("SamsungTV.");
		System.out.println("볼륨 up");
	}
		
	void volumeDown() {
		System.out.println("SamsungTV.");
		System.out.println("볼륨 down");
	}  
}
