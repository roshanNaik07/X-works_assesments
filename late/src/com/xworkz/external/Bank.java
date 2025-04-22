package com.xworkz.external;

import com.xworkz.internal.ATM;

public class Bank {

    ATM atm;

    public Bank(ATM atm) {
        System.out.println("no arg constructor of Bank");
        this.atm = atm;
    }

    public void operate() {
        if (this.atm != null) {
            System.out.println("Running operate in Bank");
            this.atm.withdraw();
        } else {
            System.err.println("ATM is null");
        }
    }
}
