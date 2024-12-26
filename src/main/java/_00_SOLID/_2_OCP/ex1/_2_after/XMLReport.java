package _00_SOLID._2_OCP.ex1._2_after;

public class XMLReport implements Report{
    @Override
    public void generate() {
        System.out.println("Generating XML report...");
    }
}
