package day01;

public interface User {

    String getUserEmail();

    String getPassword();

    static User of(String email, String password) {
        return new NormalUser(email, password);
    }
}
