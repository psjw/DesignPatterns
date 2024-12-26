package _00_SOLID._3_LSP.ex2._2_after;

// Implementations
class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
