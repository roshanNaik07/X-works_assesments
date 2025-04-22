package com.xworkz.external;

import com.xworkz.internal.TelecomService;

public class Mobile {
    TelecomService telecom;

    public Mobile(TelecomService telecom) {
        this.telecom = telecom;
        System.out.println("Mobile constructor with TelecomService");
    }

    public void useInternet() {
        if (telecom != null) {
            System.out.println("Using internet...");
            telecom.provideNetwork();
        }
    }
}
