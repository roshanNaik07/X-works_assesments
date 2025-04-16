package com.xworkz.Rules;

public class TelephoneTower implements Tower {

    @Override
    public void rules() {
        System.out.println("Rules of Telephone Tower");
    }

    @Override
    public void safety() {
        System.out.println("Safety of Telephone Tower");
    }

    @Override
    public void tower() {
        System.out.println("Telephone Tower");
    }

}
