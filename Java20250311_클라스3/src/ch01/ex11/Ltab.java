package ch01.ex11;

public class Ltab extends Mobile {
	
    public Ltab() {}

    public Ltab(String mobileName, int batterySize, String osType) {
        super(mobileName, batterySize, osType);
    }

    @Override
    public void operate(int time) {
        setBatterySize(getBatterySize() - (10 * time));
    }

    @Override
    public void charge(int time) {
        setBatterySize(getBatterySize() + (10 * time));
    }

}
