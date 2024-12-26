package _00_SOLID._1_srp.ex1._2_after;

public class UserService {
    private UserRepository userRepository = new UserRepository();
    private EmailService emailService = new EmailService();
    private UserActivityLogger userActivityLogger = new UserActivityLogger();

    public void registerUser(User user) {
        userRepository.saveUser(user);
        emailService.sendWelcomeEmail(user);
        userActivityLogger.logUserActivity(user);
    }
}
