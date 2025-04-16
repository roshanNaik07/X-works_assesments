package com.xworkz.Implimentaton1;

public class Shooting implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Shooting rules");
    }

    @Override
    public void safety() {
        System.out.println("Shooting safety");
    }

    @Override
    public void equipment() {
        System.out.println("Shooting equipment");
    }

    @Override
    public void forest() {
        System.out.println("Shooting forest");
    }
}
