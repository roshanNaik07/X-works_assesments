package com.xworkz.Rules;

public class MusiumVisitors implements Musium{

    @Override
    public void rules() {
        System.out.println("No food or drink allowed");
    }

    @Override
    public void guides() {
        System.out.println("Visitors must be accompanied by a guide");
    }

    @Override
    public void tickets() {
        System.out.println("Tickets must be purchased in advance");
    }

    @Override
    public void safety() {
        System.out.println("Safety is a priority in the museum.");
    }

}
