package com.xworkz.AfterYugadi.Internal;

public class Artist extends Art{

    public Artist(){
        System.out.println("Running no arg cont of Artist");
    }

    @Override
    public void create(){
        System.out.println("Running create in Artist");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Artist ");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Artist");
    }

    @Override
    public void frame(){
        System.out.println("Running frame in Artist");
    }

    @Override
    public void fix(){
        System.out.println("Running fix in Artist");
    }
}

