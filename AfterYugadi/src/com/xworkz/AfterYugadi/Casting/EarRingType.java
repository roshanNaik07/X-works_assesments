package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Accessories;
import com.xworkz.AfterYugadi.Internal.EarRing;

public class EarRingType {

    public void EarRingColor(Accessories accessories){
        accessories.buy();
        accessories.color();
        accessories.prepare();
        accessories.wear();
        accessories.sell();

        if (accessories instanceof EarRing){

            EarRing earRing = (EarRing) accessories;
            earRing.material();
        }
    }
}
