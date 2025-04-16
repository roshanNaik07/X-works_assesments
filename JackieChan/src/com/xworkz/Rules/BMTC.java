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
}
