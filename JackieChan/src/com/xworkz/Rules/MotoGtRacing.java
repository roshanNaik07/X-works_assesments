package com.xworkz.Rules;

public class MotoGtRacing implements Racing {

    @Override
    public void rules() {
        System.out.println("Moto Gt Racing rules");
    }

    @Override
    public void safety() {
        System.out.println("Moto Gt Racing safety");
    }

    @Override
    public void racing() {
        System.out.println("Moto Gt Racing");
    }

    @Override
    public void driver() {
        System.out.println("The driver for Moto Gt Racing is John Doe.");
    }
}
