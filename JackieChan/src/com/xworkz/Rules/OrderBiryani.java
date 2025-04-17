package com.xworkz.Rules;

public class OrderBiryani implements OrderFood{

    @Override
    public void order() {
        System.out.println("Order food");
    }

    @Override
    public void delivery() {
        System.out.println("Delivery food");
    }

    @Override
    public void payment() {
        System.out.println("Payment for food");
    }

    @Override
    public void type(){
        System.out.println("Type of food");
    }
}
