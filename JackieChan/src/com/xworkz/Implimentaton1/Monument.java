package com.xworkz.Implimentaton1;

public class Monument implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Monument rules");
    }

    @Override
    public void safety() {
        System.out.println("Monument safety");
    }

    @Override
    public void equipment() {
        System.out.println("Monument equipment");
    }

    @Override
    public void forest() {
        System.out.println("Monument forest");
    }
}
