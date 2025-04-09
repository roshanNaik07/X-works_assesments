package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Color;
import com.xworkz.AfterYugadi.Internal.Orange;

public class ColorVerity {

    public void type(Color color){
        color.apply();
        color.throwColor();
        color.buy();
        color.price();
        color.wash();

        if (color instanceof Orange){
            Orange orange = (Orange) color;
            orange.manufacture();
        }
    }
}
