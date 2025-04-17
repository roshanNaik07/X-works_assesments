package com.xworkz.Rules;

public interface StartUp {

    void returnsAndExchanges();

    void privacyPolicy();

    void termsAndConditions();

    default void startupCulture() {
        System.out.println("Startup culture is important");
    }
}
