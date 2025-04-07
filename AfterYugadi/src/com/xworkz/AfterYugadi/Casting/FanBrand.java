package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Fan;
import com.xworkz.AfterYugadi.Internal.Usha;

public class FanBrand {

    public void brandName(Fan fan){
        fan.brand();
        fan.rotate();
        fan.buy();
        fan.price();
        fan.color();

        if (fan instanceof Usha){
            Usha usha = new Usha();
            usha.brand();
        }
    }
}
