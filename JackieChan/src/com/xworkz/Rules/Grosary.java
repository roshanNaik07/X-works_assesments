package com.xworkz.Rules;

public class Grosary implements Shop{

    @Override
    public void rules() {
        System.out.println("Grosary rules");
    }

    @Override
    public void safety() {
        System.out.println("Grosary safety");
    }

    @Override
    public void shop() {
        System.out.println("Grosary shop");
    }
}
