package com.xworkz.AfterYugadi.Internal;

public class Colgate extends Paste{

    public Colgate(){
        System.out.println("Running no arg const of Colgate");
    }

    @Override
    public void color(){
        System.out.println("Running color in Colgate");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Colgate");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Colgate");
    }

    @Override
    public void apply(){
        System.out.println("Running apply in Colgate");
    }

    @Override
    public void price(){
        System.out.println("Running price in Colgate");
    }
}
