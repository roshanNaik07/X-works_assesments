package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.FitnessBand;
import com.xworkz.AfterYugadi.Internal.MiBand;

public class BandBrand {

    public void type(FitnessBand fitnessBand){
        fitnessBand.buy();
        fitnessBand.gift();
        fitnessBand.set();
        fitnessBand.sell();
        fitnessBand.price();

        if (fitnessBand instanceof MiBand){
            MiBand miBand = (MiBand) fitnessBand;
            miBand.wear();
        }
    }
}
