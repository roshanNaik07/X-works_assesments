package com.xworkz.Implimentaton1;

public class Boss implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Boss rules");
    }

    @Override
    public void safety() {
        System.out.println("Boss safety");
    }

    @Override
    public void equipment() {
        System.out.println("Boss equipment");
    }

    @Override
    public void forest() {
        System.out.println("Boss forest");
    }
}
