package com.xworkz.Rules;

public class Diver implements ScubaDive{

    @Override
    public void rules() {
        System.out.println("Diver rules");
    }

    @Override
    public void safety() {
        System.out.println("Diver safety");
    }

    @Override
    public void equipment() {
        System.out.println("Diver equipment");
    }

}
