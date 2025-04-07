package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Bright;
import com.xworkz.AfterYugadi.Internal.Pen;

public class PenBrand {

    public void type(Pen pen){
        pen.buy();
        pen.use();
        pen.color();
        pen.price();
        pen.refill();

        if (pen instanceof Bright){
            Bright bright = (Bright) pen;
            bright.brand();
        }
    }
}
