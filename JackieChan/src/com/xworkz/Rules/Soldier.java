package com.xworkz.Rules;

public class Soldier implements Military{

    @Override
    public void rules() {
        System.out.println("Soldier rules");
    }

    @Override
    public void weapons() {
        System.out.println("Soldier weapons");
    }

    @Override
    public void soldiers() {
        System.out.println("Soldier training");
    }
}
