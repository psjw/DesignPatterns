package _00_SOLID._2_ocp.ex1._2_after;

public class HTMLReport implements Report{
    @Override
    public void generate() {
        System.out.println("Generating HTML report...");
    }
}
