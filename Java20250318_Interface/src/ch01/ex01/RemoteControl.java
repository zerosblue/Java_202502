package ch01.ex01;

public interface RemoteControl {
	
	public void turnOn();
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void trunOff();
	void setVolume(int volume);
	


}
