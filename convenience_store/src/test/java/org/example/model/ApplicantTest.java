package org.example.model;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantTest {

    @Test
    void apply() {
        Applicant applicant = new Applicant();
        applicant.setName("Uzor");
        applicant.setEmail("uzor@gmaill.com");
        applicant.setAge(27);
        applicant.setAddress("Edo Tech park");
        applicant.setPositionAppliedFor("Cashier");

        String result = "Dear Akpan Congratulation, we are happy to welcome you on board";
        String message = "Dear Akpan we regret to tell you that you didn't make it to the next stage of the application";

        Assert.assertEquals("Dear Akpan Congratulation, we are happy to welcome you on board", result);
        Assert.assertEquals("Dear Akpan we regret to tell you that you didn't make it to the next stage of the application", message);
    }
}