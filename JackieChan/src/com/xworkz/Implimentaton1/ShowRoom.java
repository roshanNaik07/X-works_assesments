package com.xworkz.Implimentaton1;

public class ShowRoom implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("ShowRoom rules");
    }

    @Override
    public void safety() {
        System.out.println("ShowRoom safety");
    }

    @Override
    public void equipment() {
        System.out.println("ShowRoom equipment");
    }

    @Override
    public void forest() {
        System.out.println("ShowRoom forest");
    }
}
