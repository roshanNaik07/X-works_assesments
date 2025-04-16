package com.xworkz.Implimentaton1;

public class Film implements com.xworkz.Rules.Crop, com.xworkz.Rules.Cricket {

    @Override
    public void rules() {
        System.out.println("Film rules");
    }

    @Override
    public void players() {
        System.out.println("Film players");
    }

    @Override
    public void umpireDecision() {
        System.out.println("Film umpire decision");
    }

    @Override
    public void growth() {
        System.out.println("Film growth");
    }

    @Override
    public void yield() {
        System.out.println("Film yield");
    }

    @Override
    public void crop() {
        System.out.println("Film crop");
    }
}
