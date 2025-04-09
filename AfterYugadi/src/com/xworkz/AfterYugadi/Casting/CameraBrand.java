package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Camera;
import com.xworkz.AfterYugadi.Internal.Nikon;

public class CameraBrand {

    public void type(Camera camera){
        camera.buy();
        camera.click();
        camera.focus();
        camera.operate();
        camera.lens();

        if (camera instanceof Nikon){

            Nikon nikon = (Nikon) camera;
            nikon.price();
        }
    }
}
