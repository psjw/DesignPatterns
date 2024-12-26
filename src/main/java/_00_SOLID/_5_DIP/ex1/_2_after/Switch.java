package _00_SOLID._5_DIP.ex1._2_after;

// High-level class
public class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}
