package org.example.model;

import org.example.enums.Qualification;
import org.example.interfaces.ManagerInterface;
import org.example.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Person implements ManagerInterface {

    @Override
    public String hire(Applicant applicant) {
        String message = "";
        List<Applicant> applicants = new ArrayList<>();
        if (applicant.getQualification() == Qualification.HND || applicant.getQualification() == Qualification.BSC){
            applicants.add(applicant);
            message = "Dear " + applicant.getName() + " congratulations, you have been employed as a Cashier";
        }else {
            message = "Dear " + applicant.getName() + " We will get back to you later";
        }
            return message;
    }
}
