package com.xworkz.Rules;

public class Poojari implements Temple{

    @Override
    public void rules() {
        System.out.println("Poojari rules");
    }

    @Override
    public void pooja() {
        System.out.println("Poojari pooja");
    }

    @Override
    public void prasad() {
        System.out.println("Poojari temple");
    }

    @Override
    public void rituals() {
        System.out.println("Rituals are an important part of temple practices.");
    }
}
