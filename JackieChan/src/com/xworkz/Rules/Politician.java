package com.xworkz.Rules;

public class Politician implements Politics {

    @Override
    public void rules() {
        System.out.println("Politician rules");
    }

    @Override
    public void safety() {
        System.out.println("Politician safety");
    }

    @Override
    public void equipment() {
        System.out.println("Politician equipment");
    }

}
