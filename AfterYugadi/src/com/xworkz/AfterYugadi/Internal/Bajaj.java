package com.xworkz.AfterYugadi.Internal;

public class Bajaj extends IronBox{

    public Bajaj(){
        System.out.println("Running no arg const of Bajaj");
    }

    @Override
    public void color(){
        System.out.println("Running color in Bajaj");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in Bajaj");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in Bajaj");
    }

    @Override
    public void iron(){
        System.out.println("Running iron in Bajaj");
    }

    @Override
    public void price(){
        System.out.println("Running price in Bajaj");
    }

    public void company(){
        System.out.println("Running company in Bajaj");
    }
}
