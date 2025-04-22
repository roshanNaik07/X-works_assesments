package com.xworkz.internal;

public class ByjusImpl implements EducationPortal {
    public ByjusImpl() {
        System.out.println("Running no-arg const of ByjusImpl");
    }

    @Override
    public void studyOnline() {
        System.out.println("Studying using ByjusImpl");
    }
}
