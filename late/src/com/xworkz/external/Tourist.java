package com.xworkz.external;

import com.xworkz.internal.TravelAgency;

public class Tourist {
    TravelAgency travelAgency;

    public Tourist(TravelAgency travelAgency) {
        this.travelAgency = travelAgency;
        System.out.println("Tourist constructor with TravelAgency");
    }

    public void goVacation() {
        if (travelAgency != null) {
            System.out.println("Planning vacation...");
            travelAgency.bookTrip();
        }
    }
}
