package _00_SOLID._1_srp.ex1._2_after;

public class UserRepository {
    public void saveUser(User user) {
        // Save user to database
        System.out.println("User saved to database: " + user.getName());
    }
}
