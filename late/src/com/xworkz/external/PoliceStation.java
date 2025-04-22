package com.xworkz.external;

import com.xworkz.internal.Police;

public class PoliceStation {
    Police police;

    public PoliceStation(Police police) {
        this.police = police;
        System.out.println("Running no arg const of PoliceStation");
    }

    public void fileFIR() {
        if (this.police != null) {
            System.out.println("Running fileFIR in PoliceStation");
            this.police.fileFIR();
        } else {
            System.err.println("Police is null");
        }
    }
}
