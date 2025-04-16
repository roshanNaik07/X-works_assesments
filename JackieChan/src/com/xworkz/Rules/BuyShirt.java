package com.xworkz.Rules;

public class BuyShirt implements BuyThings{

    @Override
    public void returnsAndExchanges() {
        System.out.println("Returns and exchanges are allowed within 30 days of purchase.");
    }

    @Override
    public void privacyPolicy() {
        System.out.println("Your personal information will be kept confidential.");
    }

    @Override
    public void termsAndConditions() {
        System.out.println("By purchasing, you agree to our terms and conditions.");
    }
}
