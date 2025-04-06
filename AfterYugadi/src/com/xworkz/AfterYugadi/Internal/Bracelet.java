package com.xworkz.AfterYugadi.Internal;

public class Bracelet extends Ornament{

    public Bracelet(){
        System.out.println("Running no arg const of Bracelet");
    }

    @Override
    public void color(){
        System.out.println("Running color in Bracelet");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Bracelet");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Bracelet");
    }

    @Override
    public void giveShape(){
        System.out.println("Running giveShape in Bracelet");
    }

    @Override
    public void price(){
        System.out.println("Running price in Bracelet");
    }
}
