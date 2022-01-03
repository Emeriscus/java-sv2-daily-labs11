package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    @Test
    void normalUserCreateTest() {

        User user = new NormalUser("wefrwe@weff.hu", "qwertz");

        assertEquals("wefrwe@weff.hu", user.getUserEmail());
        assertEquals("qwertz", user.getPassword());
    }
}