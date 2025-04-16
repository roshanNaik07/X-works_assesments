package com.xworkz.Implimentaton1;

public class Dance implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Dance rules");
    }

    @Override
    public void safety() {
        System.out.println("Dance safety");
    }

    @Override
    public void equipment() {
        System.out.println("Dance equipment");
    }

    @Override
    public void forest() {
        System.out.println("Dance forest");
    }
}
