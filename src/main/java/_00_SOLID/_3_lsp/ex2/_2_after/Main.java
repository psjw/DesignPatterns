package _00_SOLID._3_lsp.ex2._2_after;

// Usage
public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // LSP Violation
        Rectangle rectangle = new Rectangle();
        calculator.calculateArea(rectangle); // Output: Area: 20

        Square square = new Square();
        calculator.calculateArea(square); // Output: Area: 16 (Unexpected)

        // LSP Compliant
        Shape rectangle1 = new Rectangle(5, 4);
        calculator.calculateArea(rectangle1); // Output: Area: 20

        Shape square1 = new Square(5);
        calculator.calculateArea(square1); // Output: Area: 25 (Expected)
    }
}