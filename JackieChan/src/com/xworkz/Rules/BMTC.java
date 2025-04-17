package com.xworkz.Rules;

public class BMTC implements Bus {

    @Override
    public void rules() {
        System.out.println("BMTC rules");
    }

    @Override
    public void safety() {
        System.out.println("BMTC safety");
    }

    @Override
    public void bus() {
        System.out.println("BMTC bus");
    }

    @Override
    public void timing() {
        System.out.println("The timing for BMTC is 10:00 AM.");
    }
}
