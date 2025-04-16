package com.xworkz.Rules;

public class FamilyMember implements HomeRules {

    @Override
    public void neighbors() {
        System.out.println("Neighbors are important for a family.");
    }

    @Override
    public void friends() {
        System.out.println("Friends are important for a family.");
    }

    @Override
    public void houseHelp() {
        System.out.println("House help is important for a family.");
    }
}
