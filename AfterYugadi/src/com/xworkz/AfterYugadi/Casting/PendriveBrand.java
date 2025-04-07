package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Pendrive;
import com.xworkz.AfterYugadi.Internal.Sandisk;

public class PendriveBrand {

    public void specifications(Pendrive pendrive){
        pendrive.buyPendrive();
        pendrive.sellPendrive();
        pendrive.eject();
        pendrive.plugIn();
        pendrive.upload();

        if (pendrive instanceof Sandisk){

            Sandisk sandisk = (Sandisk) pendrive;
            sandisk.memory();
        }
    }
}
