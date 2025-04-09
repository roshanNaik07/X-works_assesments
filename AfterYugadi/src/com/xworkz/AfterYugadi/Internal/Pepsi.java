package com.xworkz.AfterYugadi.Internal;

public class Pepsi extends SoftDrink{

    public Pepsi(){
        System.out.println("Running no arg const of Pepsi");
    }

    @Override
    public void drink(){
        System.out.println("Running drink in Pepsi");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Pepsi");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Pepsi");
    }

    @Override
    public void spill(){
        System.out.println("Running spill in Pepsi");
    }

    @Override
    public void price(){
        System.out.println("Running price in Pepsi");
    }

    public void brand(){
        System.out.println("Running brand in Pepsi");
    }
}
