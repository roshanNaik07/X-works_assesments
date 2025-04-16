package com.xworkz.Implimentaton1;

public class practice implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("practice rules");
    }

    @Override
    public void safety() {
        System.out.println("practice safety");
    }

    @Override
    public void equipment() {
        System.out.println("practice equipment");
    }

    @Override
    public void forest() {
        System.out.println("practice forest");
    }
}
