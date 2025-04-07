package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Battery;
import com.xworkz.AfterYugadi.Internal.Panasonic;

public class BatteryBrand {

    public void type(Battery battery){
        battery.blast();
        battery.plug();
        battery.buy();
        battery.price();
        battery.size();

        if (battery instanceof Panasonic){
            Panasonic panasonic = (Panasonic) battery;
            panasonic.lifeSpan();
        }
    }
}
