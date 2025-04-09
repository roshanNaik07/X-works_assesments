package com.xworkz.AfterYugadi.Internal;

public class Z extends Perfume{

    public Z(){
        System.out.println("Running no arg const of Z");
    }

    @Override
    public void color(){
        System.out.println("Running color in Z");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Z");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Z");
    }

    @Override
    public void apply(){
        System.out.println("Running apply in Z");
    }

    @Override
    public void price(){
        System.out.println("Running price in Z");
    }
}
