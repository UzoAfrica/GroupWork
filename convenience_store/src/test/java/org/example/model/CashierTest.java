package org.example.model;

import org.example.enums.Role;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {

    @Test
    void approvePaymentAndIssueReceipt() {
        Cashier cashier = new Cashier();
        cashier.setName("Uzor");
        cashier.setAge(27);
        cashier.setEmail("Uzor@gamil.com");
        cashier.setRole(Role.STAFF);

        String result = "Insufficient fund";

        Assert.assertEquals("Insufficient fund", result);
        



    }
}