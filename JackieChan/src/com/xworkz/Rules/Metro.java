package com.xworkz.Rules;

public class Metro implements Train {

    @Override
    public void rules() {
        System.out.println("Metro rules");
    }

    @Override
    public void safety() {
        System.out.println("Metro safety");
    }

    @Override
    public void train() {
        System.out.println("Metro train");
    }

    @Override
    public void timing() {
        System.out.println("The timing for metro is 10:00 AM.");
    }

}
