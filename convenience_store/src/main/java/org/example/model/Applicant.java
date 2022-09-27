package org.example.model;

import org.example.enums.Qualification;
import org.example.interfaces.ApplicantInterface;

public class Applicant extends Person implements ApplicantInterface {
    private Qualification qualification;
    private String positionAppliedFor;

    private int score;

    public Applicant() {
    }

    public Applicant(Qualification qualification, String positionAppliedFor) {
        this.qualification = qualification;
        this.positionAppliedFor = positionAppliedFor;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public String getPositionAppliedFor() {
        return positionAppliedFor;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public void setPositionAppliedFor(String positionAppliedFor) {
        this.positionAppliedFor = positionAppliedFor;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "qualification=" + qualification +
                ", positionAppliedFor='" + positionAppliedFor + '\'' +
                '}';
    }

    @Override
    public String apply(Applicant applicant) {
        return null;
    }
}
