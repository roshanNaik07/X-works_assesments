package com.xworkz.external;

import com.xworkz.internal.LicAgent;

public class LIC {

    LicAgent licAgent;

    public LIC (LicAgent licAgent){
        this.licAgent=licAgent;
        System.out.println("Running licAgents parameter in LIC");
    }

    public void policyRequirements(){
        if (licAgent !=null){
            System.out.println("Running policyRequirements in LIC");
            licAgent.getClients();
        }
        else {
            System.out.println("licAgent is null");
        }

    }

}
