package com.xworkz.Implimentaton1;

public class ChatGpt implements com.xworkz.Rules.Courier, com.xworkz.Rules.AmazonForest {

    @Override
    public void rules() {
        System.out.println("Rules are important");
    }

    @Override
    public void safety() {
        System.out.println("Safety is important");
    }

    @Override
    public void forest() {
        System.out.println("Forest is important");
    }

    @Override
    public void protect() {
        System.out.println("Protect is important");
    }

    @Override
    public void courier() {
        System.out.println("Courier is important");
    }
}
