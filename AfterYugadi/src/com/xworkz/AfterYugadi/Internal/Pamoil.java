package com.xworkz.AfterYugadi.Internal;

public class Pamoil extends Oil{

    public Pamoil(){
        System.out.println("Running no arg const of Pamoil");
    }

    @Override
    public void quality(){
        System.out.println("Running quality in Pamoil");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Pamoil");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Pamoil");
    }

    @Override
    public void apply(){
        System.out.println("Running apply in Pamoil");
    }

    @Override
    public void price(){
        System.out.println("Running price in Pamoil");
    }

    public void cook(){
        System.out.println("Running cook in Pamoil");
    }
}
