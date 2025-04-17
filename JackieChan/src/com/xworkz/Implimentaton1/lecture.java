package com.xworkz.Implimentaton1;

public class lecture implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("lecture rules");
    }

    @Override
    public void safety() {
        System.out.println("lecture safety");
    }

    @Override
    public void equipment() {
        System.out.println("lecture equipment");
    }

    @Override
    public void forest() {
        System.out.println("lecture forest");
    }
}
