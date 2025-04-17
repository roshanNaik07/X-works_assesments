package com.xworkz.Rules;

public class SpaceWar implements ColdWar{
    @Override
    public void rules() {
        System.out.println("Space war rules");
    }

    @Override
    public void safety() {
        System.out.println("Space war safety");
    }

    @Override
    public void coldWar() {
        System.out.println("Space war");
    }

    @Override
    public void economyReasons() {
        System.out.println("Economic reasons are space war.");
    }

}
