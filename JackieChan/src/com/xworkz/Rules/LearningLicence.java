package com.xworkz.Rules;

public class LearningLicence implements Licence{

    @Override
    public void rules() {
        System.out.println("Learning Licence Rules");
    }

    @Override
    public void vehicles() {
        System.out.println("Learning Licence Vehicles");
    }

    @Override
    public void signals() {
        System.out.println("Learning Licence Signals");
    }

    @Override
    public void apply() {
        System.out.println("Apply for Learning Licence");
    }
}
