package com.xworkz.Implimentaton1;

public class Concert implements com.xworkz.Rules.BaseBall, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Concert rules");
    }

    @Override
    public void safety() {
        System.out.println("Concert safety");
    }

    @Override
    public void equipment() {
        System.out.println("Concert equipment");
    }

    @Override
    public void forest() {
        System.out.println("Concert forest");
    }
}
