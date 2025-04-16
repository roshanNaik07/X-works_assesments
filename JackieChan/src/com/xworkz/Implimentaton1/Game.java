package com.xworkz.Implimentaton1;

public class Game implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Game rules");
    }

    @Override
    public void safety() {
        System.out.println("Game safety");
    }

    @Override
    public void equipment() {
        System.out.println("Game equipment");
    }

    @Override
    public void forest() {
        System.out.println("Game forest");
    }
}
