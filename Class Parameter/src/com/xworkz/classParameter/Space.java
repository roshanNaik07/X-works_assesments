package com.xworkz.classParameter;

public class Space {

    void spaceAgency(SpaceX spaceX){
        System.out.println("Running spaceAgency in Space");
        if(spaceX!=null){
            spaceX.launchRocket();
        }
        else
            System.err.println("spaceX ref is pointing to null");
    }
}
