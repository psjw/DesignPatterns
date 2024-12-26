package _00_SOLID._3_lsp.ex1._1_before;

public class Main {
    public static void main(String[] args) {
        //최소한 자식은 부모가 하는 일은 모두 할 수 있어야 한다.
        //펭귄은 날수 없다. -> 부모 클래스의 fly()를 할 수 없다.
        Bird bird = new Bird();
        bird.fly(); // Bird is flying

        Bird penguin = new Penguin();
        penguin.fly(); // Throws UnsupportedOperationException
    }
}
