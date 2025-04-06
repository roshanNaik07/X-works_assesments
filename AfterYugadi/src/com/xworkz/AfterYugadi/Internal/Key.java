package com.xworkz.AfterYugadi.Internal;

public class Key extends MatchBox{

    public Key(){
        System.out.println("Running no arg const of Key");
    }

    @Override
    public void color(){
        System.out.println("Running color in Key");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Key");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Key");
    }

    @Override
    public void manufacture(){
        System.out.println("Running manufacture in Key");
    }

    @Override
    public void price(){
        System.out.println("Running price in Key");
    }
}
