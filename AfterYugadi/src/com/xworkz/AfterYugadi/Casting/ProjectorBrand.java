package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Epson;
import com.xworkz.AfterYugadi.Internal.Projector;

public class ProjectorBrand {

    public void type(Projector projector){
        projector.Off();
        projector.On();
        projector.price();
        projector.buy();
        projector.size();

        if (projector instanceof Epson){
            Epson epson = (Epson) projector;
            epson.version();
        }
    }
}
