package com.xworkz.Implimentaton1;

public class Health implements com.xworkz.Rules.Crop, com.xworkz.Rules.Cricket {

    @Override
    public void rules() {
        System.out.println("Health rules");
    }

    @Override
    public void players() {
        System.out.println("Health players");
    }

    @Override
    public void umpireDecision() {
        System.out.println("Health umpireDecision");
    }

    @Override
    public void growth() {
        System.out.println("Health growth");
    }

    @Override
    public void yield() {
        System.out.println("Health yield");
    }

    @Override
    public void crop() {
        System.out.println("Health crop");
    }
}
