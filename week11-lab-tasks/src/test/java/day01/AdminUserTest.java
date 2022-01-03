package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void adminUserTest() {

        User user = new AdminUser("koko@gmail.com", "Annotation2321.PP");

        assertEquals("koko@gmail.com", user.getUserEmail());
        assertEquals("*****************", user.getPassword());
    }
}