package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.ColorPencil;
import com.xworkz.AfterYugadi.Internal.FibreCastle;

public class ColorPencilBrand {

    public void type(ColorPencil colorPencil){
        colorPencil.buy();
        colorPencil.color();
        colorPencil.write();
        colorPencil.price();
        colorPencil.use();

        if (colorPencil instanceof FibreCastle){

            FibreCastle fibreCastle = (FibreCastle) colorPencil;
            fibreCastle.manufacture();
        }
    }
}
