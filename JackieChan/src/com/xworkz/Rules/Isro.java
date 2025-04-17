package com.xworkz.Rules;

public class Isro implements Satellite{

    @Override
    public void rules() {
        System.out.println("Satellite launched by ISRO");
    }

    @Override
    public void satellites() {
        System.out.println("Rocket launched by ISRO");
    }

    @Override
    public void signals() {
        System.out.println("Launch vehicle launched by ISRO");
    }

    @Override
    public void launch() {
        System.out.println("Satellite launched by ISRO");
    }
}
