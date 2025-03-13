package ch01.ex05;

public class LGTV extends TV{
	
	@Override 
	void powerOn() {
		System.out.println("LGTV.");
		System.out.println("전원 on");
	}
		
	void powerOff() {
		System.out.println("LGTV.");
		System.out.println("전원 off");
	}
		   
	void volumeUp() {
		System.out.println("LGTV.");
		System.out.println("볼륨 up");
	}
		
	void volumeDown() {
		System.out.println("LGTV.");
		System.out.println("볼륨 down");
	}  

	  
}
