package _00_SOLID._5_DIP.ex1._2_after;

// Low-level class implementing the interface
public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is spinning");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is stopping");
    }
}
