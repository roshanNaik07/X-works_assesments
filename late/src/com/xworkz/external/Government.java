package com.xworkz.external;

import com.xworkz.internal.Constitution;

public class Government {

    Constitution constitution;

    public Government(Constitution constitution) {
        System.out.println("Running no arg const of Government");
        this.constitution = constitution;
    }

    public void applyRules() {
        if (this.constitution != null) {
            System.out.println("Running applyRules in Government");
            this.constitution.followRules();
        } else {
            System.err.println("Constitution is null");
        }
    }
}

