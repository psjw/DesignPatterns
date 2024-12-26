package _00_SOLID._1_srp.ex1._2_after;

public class EmailService {
    public void sendWelcomeEmail(User user) {
        // Send welcome email to user
        System.out.println("Welcome email sent to: " + user.getEmail());
    }
}
