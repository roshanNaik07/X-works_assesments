package com.xworkz.Rules;

public class CoalIndustry implements Industry{

    @Override
    public void rules() {
        System.out.println("Coal Industry Rules");
    }

    @Override
    public void employees() {
        System.out.println("Coal Industry Safety");
    }

    @Override
    public void managers() {
        System.out.println("Coal Industry Environment");
    }

    @Override
    public void safety() {
        System.out.println("Safety is a priority in the coal industry.");
    }
}
