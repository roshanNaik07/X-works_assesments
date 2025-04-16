package com.xworkz.Rules;

public class Andaman implements Island{
    @Override
    public void rules() {
        System.out.println("Andaman has strict rules for visitors.");
    }

    @Override
    public void safety() {
        System.out.println("Safety measures are in place for tourists.");
    }

    @Override
    public void island() {
        System.out.println("Andaman is a beautiful island destination.");
    }
}
