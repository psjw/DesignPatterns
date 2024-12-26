package _00_SOLID._4_ISP.ex1._2_after;

// Class representing a regular worker
public class Employee implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }
}
