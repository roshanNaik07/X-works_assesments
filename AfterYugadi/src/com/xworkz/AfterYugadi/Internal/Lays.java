package com.xworkz.AfterYugadi.Internal;

public class Lays extends Snacks{

    public Lays(){
        System.out.println("Running no arg const of Lays");
    }

    @Override
    public void eat(){
        System.out.println("Running drink in Lays");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Lays");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Lays");
    }

    @Override
    public void prepare(){
        System.out.println("Running prepare in Lays");
    }

    @Override
    public void price(){
        System.out.println("Running price in Lays");
    }
}
