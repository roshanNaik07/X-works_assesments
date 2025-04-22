package com.xworkz.external;

import com.xworkz.internal.Connector;

public class ConnectorUser {

    private Connector connector;

    public ConnectorUser(Connector connector){
        this.connector=connector;
        System.out.println("Running connector arg constructor in ConnectorUser");
    }

    public void execute(){
        if (connector!=null){
            System.out.println("Running execute in ConnectorUser ");
            connector.run();
        }
        else {
            System.err.println("connector is null");
        }
    }
}
