package com.xworkz.Rules;

public class BuildHome implements Construction {

    @Override
    public void rules() {
        System.out.println("Building rules are followed");
    }

    @Override
    public void safety() {
        System.out.println("Safety measures are taken");
    }

    @Override
    public void construction() {
        System.out.println("Construction is in progress");
    }

}
