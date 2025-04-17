package com.xworkz.Rules;

public class IndianBank implements Bank {

    @Override
    public void rules() {
        System.out.println("Indian Bank rules");
    }

    @Override
    public void safety() {
        System.out.println("Indian Bank safety");
    }

    @Override
    public void bank() {
        System.out.println("Indian Bank");
    }

    @Override
    public void management() {
        System.out.println("Management is important for Indian Bank");
    }
}
