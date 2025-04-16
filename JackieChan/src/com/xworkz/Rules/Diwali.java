package com.xworkz.Rules;

public class Diwali implements Festival {

    @Override
    public void rules() {
        System.out.println("Diwali rules: No firecrackers after 10 PM.");
    }

    @Override
    public void ritual() {
        System.out.println("Diwali ritual: Lighting diyas and performing puja.");
    }

    @Override
    public void festival() {
        System.out.println("Diwali festival: Celebrating the victory of light over darkness.");
    }

}
