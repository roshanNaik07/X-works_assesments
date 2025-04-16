package com.xworkz.Rules;

public class CricketPlayer implements Cricket {

    @Override
    public void rules() {
        System.out.println("Cricket rules");
    }

    @Override
    public void players() {
        System.out.println("Cricket players");
    }

    @Override
    public void umpireDecision() {
        System.out.println("Umpire decision");
    }

}
