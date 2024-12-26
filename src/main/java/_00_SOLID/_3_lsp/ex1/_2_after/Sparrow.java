package _00_SOLID._3_lsp.ex1._2_after;

// Class for a bird that can fly
public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
