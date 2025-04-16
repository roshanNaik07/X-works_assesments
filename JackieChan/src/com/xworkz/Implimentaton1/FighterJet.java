package com.xworkz.Implimentaton1;

public class FighterJet implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("FighterJet rules");
    }

    @Override
    public void safety() {
        System.out.println("FighterJet safety");
    }

    @Override
    public void equipment() {
        System.out.println("FighterJet equipment");
    }

    @Override
    public void forest() {
        System.out.println("FighterJet forest");
    }
}
