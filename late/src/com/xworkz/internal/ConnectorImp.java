package com.xworkz.internal;

public class ConnectorImp implements Connector{

    public ConnectorImp(){
        System.out.println("Running no arg const of ConnectorImp");
    }

    @Override
    public void run() {
        System.out.println("Running run in ConnectorImp");
    }
}
