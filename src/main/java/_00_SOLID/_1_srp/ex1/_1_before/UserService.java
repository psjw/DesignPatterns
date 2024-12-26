package _00_SOLID._1_srp.ex1._1_before;

class UserService {
    //하나의 클래스에 여러가지의 책임을 갖는다.
    //책임 1. 유저 저장
    //책임 2. 유저 웰컴 메일
    //책임 3. 유저 로그
    //하나의 책임을 변경시 책임 1, 2, 3 모두 영향을 받음
    public void saveUser(User user) {
        // Save user to database
        System.out.println("User saved to database: " + user.getName());
    }

    public void sendWelcomeEmail(User user) {
        // Send welcome email to user
        System.out.println("Welcome email sent to: " + user.getEmail());
    }

    public void logUserActivity(User user) {
        // Log user activity
        System.out.println("Logging activity for user: " + user.getName());
    }
}
