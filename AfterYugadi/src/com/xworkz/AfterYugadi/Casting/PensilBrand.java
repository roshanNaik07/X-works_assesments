package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Domz;
import com.xworkz.AfterYugadi.Internal.Pencil;

public class PensilBrand {

    public void brand(Pencil pencil){
        pencil.breakLed();
        pencil.use();
        pencil.buy();
        pencil.price();
        pencil.write();

        if(pencil instanceof Domz){
            Domz domz = (Domz) pencil;
            domz.type();
        }
    }
}
