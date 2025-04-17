package com.xworkz.Rules;

public class FootBallPlayer implements FootBall {

    @Override
    public void rules() {
        System.out.println("Football rules");
    }

    @Override
    public void players() {
        System.out.println("Football players");
    }

    @Override
    public void refereeDecision() {
        System.out.println("Referee decision");
    }

    @Override
    public void Practice() {
        System.out.println("Football practice is essential");
    }
}
