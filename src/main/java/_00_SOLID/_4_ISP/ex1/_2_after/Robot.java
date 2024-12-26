package _00_SOLID._4_ISP.ex1._2_after;

// Class representing a robot
public class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
    // Robot does not implement Eatable interface
}