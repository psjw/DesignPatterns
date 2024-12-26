package _00_SOLID._3_lsp.ex2._2_after;

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
