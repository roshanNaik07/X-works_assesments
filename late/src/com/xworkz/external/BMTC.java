package com.xworkz.external;

import com.xworkz.internal.Metro;

public class BMTC {

    Metro metro;

    public BMTC(Metro metro) {
        System.out.println("Running no arg const of BMTC");
        this.metro = metro;
    }

    public void manageMetro() {
        if (this.metro != null) {
            System.out.println("Running travel in BMTC");
            this.metro.buyTicket();
        } else {
            System.err.println("Metro is null");
        }
    }
}
