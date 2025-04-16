package com.xworkz.Implimentaton1;

public class Sport implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Sport rules");
    }

    @Override
    public void safety() {
        System.out.println("Sport safety");
    }

    @Override
    public void equipment() {
        System.out.println("Sport equipment");
    }

    @Override
    public void forest() {
        System.out.println("Sport forest");
    }
}
