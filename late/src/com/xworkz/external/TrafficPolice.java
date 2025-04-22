package com.xworkz.external;

import com.xworkz.internal.TrafficSignal;

public class TrafficPolice {

    TrafficSignal trafficSignal;

    public TrafficPolice(TrafficSignal trafficSignal) {
        this.trafficSignal = trafficSignal;
        System.out.println("Running no arg const of TrafficPolice");
    }

    public void manageTraffic() {
        if (this.trafficSignal != null) {
            System.out.println("Running manageTraffic in TrafficPolice");
            this.trafficSignal.controlTraffic();
        } else {
            System.err.println("TrafficSignal is null");
        }
    }
}
