package com.xworkz.Rules;

public class PumaJacket implements Jacket {

    @Override
    public void waterProof() {
        System.out.println("Puma jacket is waterproof");
    }

    @Override
    public void safety() {
        System.out.println("Puma jacket provides safety");
    }

    @Override
    public void jacket() {
        System.out.println("Puma jacket is stylish and comfortable");
    }
}
