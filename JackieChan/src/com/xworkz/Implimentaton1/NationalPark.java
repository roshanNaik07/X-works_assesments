package com.xworkz.Implimentaton1;

public class NationalPark implements com.xworkz.Rules.AmazonForest ,com.xworkz.Rules.Beach {

    @Override
    public void rules() {
        System.out.println("National Park rules");
    }

    @Override
    public void safety() {
        System.out.println("National Park safety");
    }

    @Override
    public void forest() {
        System.out.println("National Park forest");
    }
    @Override
    public void beach() {
        System.out.println("National Park fun");
    }
}
