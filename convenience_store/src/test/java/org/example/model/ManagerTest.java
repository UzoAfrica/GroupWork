package org.example.model;

import org.example.enums.Qualification;
import org.example.enums.Role;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void hire() {
        Manager manager = new Manager();
        manager.setName("Uzor");
        manager.setEmail("uzor@gmaill.com");
        manager.setAge(27);
        manager.setAddress("Edo Tech park");
        manager.setRole(Role.STAFF);

        Applicant applicant = new Applicant();
        applicant.setName("Uzor");
        applicant.setEmail("uzor@gmaill.com");
        applicant.setAge(27);
        applicant.setAddress("Edo Tech park");
        applicant.setPositionAppliedFor("Cashier");
        applicant.setQualification(Qualification.HND);

        String result = manager.hire(applicant);



        Assert.assertEquals("Dear " + applicant.getName() + " congratulations, you have been employed as a Cashier", result);

    }


        @Test
        void hire2() {
        Manager manager2 = new Manager();
        manager2.setName("Uzor");
        manager2.setEmail("uzor@gmaill.com");
        manager2.setAge(27);
        manager2.setAddress("Edo Tech park");
        manager2.setRole(Role.STAFF);



        Applicant applicant2 = new Applicant();
        applicant2.setName("Uzor");
        applicant2.setEmail("uzor@gmaill.com");
        applicant2.setAge(27);
        applicant2.setAddress("Edo Tech park");
        applicant2.setPositionAppliedFor("Cashier");
        applicant2.setQualification(Qualification.MSC);





        String result2 = manager2.hire(applicant2);



        Assert.assertEquals("Dear " + applicant2.getName() + " We will get back to you later", result2);
    }
}