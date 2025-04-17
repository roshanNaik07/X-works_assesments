package com.xworkz.Implimentaton1;

public class Magic implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Magic rules");
    }

    @Override
    public void safety() {
        System.out.println("Magic safety");
    }

    @Override
    public void equipment() {
        System.out.println("Magic equipment");
    }

    @Override
    public void forest() {
        System.out.println("Magic forest");
    }
}
