package com.xworkz.Rules;

public class OrderLaptop implements OnlineOrders{

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
        System.out.println("By placing an order, you agree to our terms and conditions.");
    }

}
