package com.xworkz.Implimentaton1;

public class Mathematics implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Mathematics rules");
    }

    @Override
    public void safety() {
        System.out.println("Mathematics safety");
    }

    @Override
    public void equipment() {
        System.out.println("Mathematics equipment");
    }

    @Override
    public void forest() {
        System.out.println("Mathematics forest");
    }
}
