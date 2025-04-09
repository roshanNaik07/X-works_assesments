package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Bottle;
import com.xworkz.AfterYugadi.Internal.PlasticBottle;

public class BottleType {

    public void bottleProperties(Bottle bottle){
        bottle.closeBottle();
        bottle.openBottle();
        bottle.color();
        bottle.fill();
        bottle.manufacture();

        if (bottle instanceof PlasticBottle){

            PlasticBottle plasticBottle = (PlasticBottle) bottle;
            plasticBottle.crush();
        }
    }
}
