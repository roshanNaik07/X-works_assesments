package com.xworkz.internal;

public class NaukriImpl implements RecruitmentAgency {
    public NaukriImpl() {
        System.out.println("NaukriImpl constructor");
    }

    @Override
    public void hireCandidate() {
        System.out.println("Candidate hired via NaukriImpl");
    }
}
