package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Remote;
import com.xworkz.AfterYugadi.Internal.SunDirect;

public class DishBrand {

    public void DishMaterial(Remote remote){
        remote.addBattery();
        remote.breakRemote();
        remote.color();
        remote.onTv();
        remote.offTv();

        if (remote instanceof SunDirect){

            SunDirect sunDirect = new SunDirect();
            sunDirect.price();
        }
    }
}
