package com.xworkz.AfterYugadi.Internal;

public class Joyo extends Bucket{

    public Joyo(){
        System.out.println("Running no arg const of Joyo");
    }

    @Override
    public void color(){
        System.out.println("Running color in Joyo");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Joyo");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Joyo");
    }

    @Override
    public void wash(){
        System.out.println("Running wash in Joyo");
    }

    @Override
    public void price(){
        System.out.println("Running price in Joyo");
    }
}
