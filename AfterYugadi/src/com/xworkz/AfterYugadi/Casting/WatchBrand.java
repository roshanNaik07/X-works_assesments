package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Titan;
import com.xworkz.AfterYugadi.Internal.Watch;

public class WatchBrand {

    public void chooseBrand(Watch watch){
        watch.buy();
        watch.gift();
        watch.set();
        watch.sell();
        watch.price();

        if (watch instanceof Titan){
            Titan titan = (Titan) watch;
            titan.belt();
        }
    }
}
