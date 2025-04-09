package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.BodyWash;
import com.xworkz.AfterYugadi.Internal.Pears;

public class BodywashBrand {

    public void type(BodyWash bodyWash){
        bodyWash.apply();
        bodyWash.buy();
        bodyWash.sell();
        bodyWash.price();
        bodyWash.color();

        if (bodyWash instanceof Pears){
            Pears pears = (Pears) bodyWash;
            pears.brand();
        }
    }
}
