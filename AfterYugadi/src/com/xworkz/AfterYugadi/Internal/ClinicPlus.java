package com.xworkz.AfterYugadi.Internal;

public class ClinicPlus extends Shampoo{

    public ClinicPlus(){
        System.out.println("Running no arg const of ClinicPlus");
    }

    @Override
    public void apply(){
        System.out.println("Running apply in ClinicPlus");
    }

    @Override
    public void buy(){
        System.out.println("Running buy in ClinicPlus");
    }

    @Override
    public void sell(){
        System.out.println("Running sell in ClinicPlus");
    }

    @Override
    public void wash(){
        System.out.println("Running wash in ClinicPlus");
    }

    @Override
    public void price(){
        System.out.println("Running price in ClinicPlus");
    }
}
