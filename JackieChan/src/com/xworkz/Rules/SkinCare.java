package com.xworkz.Rules;

public interface SkinCare {

    void skinCareHydration();

    void skinCareDiet();

    void skinCareLifestyle();

    default void skinCareRoutine() {
        System.out.println("Skin care routine is important");
    }
}
