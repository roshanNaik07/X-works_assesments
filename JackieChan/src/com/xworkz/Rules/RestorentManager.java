package com.xworkz.Rules;

public class RestorentManager implements Restorent{

    @Override
    public void rules() {
        System.out.println("Restorent rules");
    }

    @Override
    public void food() {
        System.out.println("Restorent food");
    }

    @Override
    public void service() {
        System.out.println("Restorent service");
    }

    @Override
    public void ambiance() {
        System.out.println("Restorent ambiance");
    }

    @Override
    public void cleanliness() {
        System.out.println("Restorent cleanliness is important");
    }
}
