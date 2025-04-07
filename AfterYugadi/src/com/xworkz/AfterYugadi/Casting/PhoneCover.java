package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.BackCover;
import com.xworkz.AfterYugadi.Internal.Silicon;

public class PhoneCover {

    public void coverMaterial(BackCover backCover){
        backCover.addBackCover();
        backCover.color();
        backCover.material();
        backCover.remove();
        backCover.theme();

        if (backCover instanceof Silicon){

            Silicon silicon = (Silicon) backCover;
            silicon.twist();
        }
    }
}
