package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user = new User("John", 120_000);

    @Test
    void addItemTest() {
        Item item = new Product("milk", 100);

        user.addItem(item);

        assertEquals(119_890, user.getMoney());
    }
}