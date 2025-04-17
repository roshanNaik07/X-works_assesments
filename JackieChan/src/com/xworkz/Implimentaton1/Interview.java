package com.xworkz.Implimentaton1;

public class Interview implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Interview rules");
    }

    @Override
    public void safety() {
        System.out.println("Interview safety");
    }

    @Override
    public void equipment() {
        System.out.println("Interview equipment");
    }

    @Override
    public void forest() {
        System.out.println("Interview forest");
    }
}
