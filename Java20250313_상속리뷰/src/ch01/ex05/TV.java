package ch01.ex05;

public abstract class TV {
	
	boolean power;
	
	TV(){
		power = false;
	}
	abstract void powerOn();
	
	abstract void powerOff();

	abstract void volumeUp();
	
	abstract void volumeDown();
	
}
