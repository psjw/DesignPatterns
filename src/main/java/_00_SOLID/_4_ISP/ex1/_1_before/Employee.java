package _00_SOLID._4_ISP.ex1._1_before;

// Class representing a regular worker
public class Employee implements Worker {
    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void eat() {
        System.out.println("Employee is eating");
    }
}