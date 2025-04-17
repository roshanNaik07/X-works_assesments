package com.xworkz.Rules;

public interface HomeRules {

    void neighbors();

    void friends();

    void houseHelp();

    default void familyTime() {
        System.out.println("Family time is important for a family.");
    }
}
