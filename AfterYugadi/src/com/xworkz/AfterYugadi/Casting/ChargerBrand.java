package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Charger;
import com.xworkz.AfterYugadi.Internal.LapCharger;

public class ChargerBrand {

    public void chargerType(Charger charger){
        charger.capacity();
        charger.color();
        charger.plugIn();
        charger.price();
        charger.remove();

        if (charger instanceof LapCharger){
            LapCharger lapCharger = (LapCharger) charger;
            lapCharger.length();
        }
    }
}
