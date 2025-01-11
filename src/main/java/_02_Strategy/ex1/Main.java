package _02_Strategy.ex1;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(
                new CreditCardPayment("John Doe", "1234567890123456")
        );
        cart.checkout(100);
        //100 paid with credit card

        cart.setPaymentStrategy(
                new PayPalPayment("johndoe@example.com")
        );
        cart.checkout(200);
        //200 paid using PayPal
    }

}
