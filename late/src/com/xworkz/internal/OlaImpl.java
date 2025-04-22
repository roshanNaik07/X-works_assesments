package com.xworkz.internal;

public class OlaImpl implements CabService {
    public OlaImpl() {
        System.out.println("Running no-arg const of OlaImpl");
    }

    @Override
    public void hireCab() {
        System.out.println("Hiring cab using OlaImpl");
    }
}
