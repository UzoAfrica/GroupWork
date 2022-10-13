package org.example;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void dance() {
        User user = new User ("kendrick", "kl@gmail.com",
        "080678123", "1");
        String result = user.dance();
        Object Assertions = new Object();
        Assertions.assertEquals(result, "I can dance");
    }
}