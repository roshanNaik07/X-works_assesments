package com.xworkz.Rules;

public class WarShips implements Navy {

    @Override
    public void rules() {
        System.out.println("Warships have strict rules to follow.");
    }

    @Override
    public void safety() {
        System.out.println("Safety measures are crucial for warships.");
    }

    @Override
    public void navy() {
        System.out.println("Warships are part of the navy.");
    }
}
