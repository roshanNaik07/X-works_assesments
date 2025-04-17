package com.xworkz.Rules;

public class Kargil implements War{
    @Override
    public void rules() {
        System.out.println("Kargil rules");
    }

    @Override
    public void safety() {
        System.out.println("Kargil safety");
    }

    @Override
    public void war() {
        System.out.println("Kargil war");
    }

    @Override
    public void attack() {
        System.out.println("Attack is important for Kargil.");
    }
}
