package day01;

import java.time.LocalDate;

public class SocialMedia {

    public static void main(String[] args) {
        User user = new NormalUser("fgds@ewf.com", "1234");

        User user1 = User.of("fg@rg.com", "1232");

        System.out.println(user1.getPassword());

    }
}
