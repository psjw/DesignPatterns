package _00_SOLID._3_lsp.ex1._1_before;

// Child class Penguin that violates LSP
public class Penguin extends Bird {
    @Override
    public void fly() {
        // Penguins cannot fly
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}