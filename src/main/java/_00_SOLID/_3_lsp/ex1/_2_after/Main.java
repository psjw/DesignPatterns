package _00_SOLID._3_lsp.ex1._2_after;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.eat(); // Bird is eating
        ((Flyable) sparrow).fly(); // Sparrow is flying

        Bird penguin = new Penguin();
        penguin.eat(); // Bird is eating
        // ((Flyable) penguin).fly(); // Compilation error, Penguin is not Flyable
    }
}
