package com.xworkz.Rules;

public class BaseBallPlayer implements BaseBall {

    @Override
    public void rules() {
        System.out.println("Baseball rules: 9 players, 9 innings, 3 outs per inning.");
    }

    @Override
    public void safety() {
        System.out.println("Safety gear: helmet, chest protector, shin guards.");
    }

    @Override
    public void equipment() {
        System.out.println("Equipment: bat, ball, glove, bases.");
    }
}
