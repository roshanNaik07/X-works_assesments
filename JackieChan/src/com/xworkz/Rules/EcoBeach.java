package com.xworkz.Rules;

public class EcoBeach implements Beach{
    @Override
    public void rules() {
        System.out.println("Eco Beach rules");
    }

    @Override
    public void safety() {
        System.out.println("Eco Beach safety");
    }

    @Override
    public void beach() {
        System.out.println("Eco Beach");
    }

    @Override
    public void clean() {
        System.out.println("Cleanliness is important for Eco Beach");
    }
}
