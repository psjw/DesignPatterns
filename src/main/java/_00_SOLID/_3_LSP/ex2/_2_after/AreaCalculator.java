package _00_SOLID._3_LSP.ex2._2_after;

// Client code
class AreaCalculator {
    public void calculateArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }
}
