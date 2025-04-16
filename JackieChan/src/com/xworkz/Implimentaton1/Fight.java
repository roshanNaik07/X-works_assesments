package com.xworkz.Implimentaton1;

public class Fight implements com.xworkz.Rules.BaseBall,com.xworkz.Rules.AmazonForest{

    @Override
    public void rules() {
        System.out.println("Fight rules");
    }

    @Override
    public void safety() {
        System.out.println("Fight safety");
    }

    @Override
    public void equipment() {
        System.out.println("Fight");
    }

    @Override
    public void forest() {
        System.out.println("Fight forest");
    }
}
