package com.xworkz.projector;

public class Port {

    private String type;
    private int totalPorts;
    private PortType portType;


    Port(String type,int totalPorts , PortType portType){
        this.type=type;
        this.totalPorts=totalPorts;
        this.portType=portType;
    }

    void protDetails(){
        System.out.println("-------------------------------------");
        System.out.println("Running portdetails in port");
        System.out.println("Type of the port is "+this.type);
        System.out.println("Total number of port is "+totalPorts);
        portType.portTypeDetails();
    }
}
