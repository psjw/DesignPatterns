package _00_SOLID._3_LSP.ex2._1_before;

// Client code
class AreaCalculator {
    public void calculateArea(Rectangle rectangle) {
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Area: " + rectangle.getArea());
        // Expected output for Rectangle: Area: 20
        // Actual output for Square: Area: 16 (LSP violation)
    }
}