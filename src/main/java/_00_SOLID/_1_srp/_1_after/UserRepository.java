package _00_SOLID._1_srp._1_after;

public class UserRepository {
    public void saveUser(User user) {
        // Save user to database
        System.out.println("User saved to database: " + user.getName());
    }
}
