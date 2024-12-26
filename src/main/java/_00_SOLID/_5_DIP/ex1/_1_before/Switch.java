package _00_SOLID._5_DIP.ex1._1_before;

// High-level class
public class Switch {
    private Fan fan;

    public Switch(Fan fan) {
        this.fan = fan;
    }

    public void turnOn() {
        fan.spin();
    }

    public void turnOff() {
        fan.stop();
    }
}