package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Bracelet;
import com.xworkz.AfterYugadi.Internal.Ornament;

public class OrnamentMaterial {

    public void type(Ornament ornament){
        ornament.buy();
        ornament.giveShape();
        ornament.sell();
        ornament.color();
        ornament.price();
        if (ornament instanceof Bracelet){
            Bracelet bracelet = (Bracelet) ornament;
            bracelet.material();
        }
    }
}
