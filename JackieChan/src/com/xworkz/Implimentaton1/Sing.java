package com.xworkz.Implimentaton1;

public class Sing implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Sing rules");
    }

    @Override
    public void safety() {
        System.out.println("Sing safety");
    }

    @Override
    public void equipment() {
        System.out.println("Sing equipment");
    }

    @Override
    public void forest() {
        System.out.println("Sing forest");
    }
}
