package com.xworkz.Rules;

public interface OnlineOrders {

    void returnsAndExchanges();

    void privacyPolicy();

    void termsAndConditions();

    default void paymentMethods() {
        System.out.println("We accept various payment methods including credit cards, debit cards, and PayPal.");
    }
}
