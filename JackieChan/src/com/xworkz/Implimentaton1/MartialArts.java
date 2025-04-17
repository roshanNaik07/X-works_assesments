package com.xworkz.Implimentaton1;

public class MartialArts implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Martial Arts rules");
    }

    @Override
    public void safety() {
        System.out.println("Martial Arts safety");
    }

    @Override
    public void equipment() {
        System.out.println("Martial Arts equipment");
    }

    @Override
    public void forest() {
        System.out.println("Martial Arts forest");
    }
}
