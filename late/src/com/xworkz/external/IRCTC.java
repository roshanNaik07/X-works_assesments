package com.xworkz.external;

import com.xworkz.internal.Railway;

public class IRCTC {

    Railway railway;

    public IRCTC(Railway railway) {
        System.out.println("Running no arg const of IRCTC");
        this.railway = railway;
    }

    public void bookTicket() {
        if (this.railway != null) {
            System.out.println("Running bookTicket in IRCTC");
            this.railway.getTrainTicket();
        } else {
            System.err.println("Railway is null");
        }
    }
}
