package com.xworkz.AfterYugadi.Internal;

public class Medimix extends Soap {

    public Medimix() {
        System.out.println("Running no arg const of Medimix");
    }

    @Override
    public void apply() {
        System.out.println("Running apply in Medimix");
    }

    @Override
    public void buy() {
        System.out.println("Running buy in Medimix");
    }

    @Override
    public void sell() {
        System.out.println("Running sell in Medimix");
    }

    @Override
    public void wash() {
        System.out.println("Running wash in Medimix");
    }

    @Override
    public void price() {
        System.out.println("Running price in Medimix");
    }

}
