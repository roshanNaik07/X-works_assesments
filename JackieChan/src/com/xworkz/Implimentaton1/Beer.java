package com.xworkz.Implimentaton1;

public class Beer implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Beer rules");
    }

    @Override
    public void safety() {
        System.out.println("Beer safety");
    }

    @Override
    public void equipment() {
        System.out.println("Beer equipment");
    }

    @Override
    public void forest() {
        System.out.println("Beer forest");
    }
}
